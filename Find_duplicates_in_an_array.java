/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find duplicates in an array
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/
* 
*/


class Find_duplicates_in_an_array {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int []count = new int[n+1];
        for(int x:arr){
            count[x]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<count.length;i++){
            if(count[i]>=2){
                list.add(i);
            }
        }
        if(list.size()==0){
            list.add(-1);
            return list;
        }
        return list;
    }
}
