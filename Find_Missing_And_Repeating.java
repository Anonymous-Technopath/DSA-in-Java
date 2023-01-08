/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find Missing And Repeating
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/
* 
*/

class Find_Missing_And_Repeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int sol[]=new int[2];
        Integer[] data = new Integer[n];
        Arrays. fill(data,new Integer(0));
        List<Integer> a = Arrays.asList(data);
        for(int i=0;i<n;i++){
            a.set(arr[i]-1,a.get(arr[i]-1)+1);
        }
        sol[0]=a.indexOf(2)+1;
        sol[1]=a.indexOf(0)+1;
        return sol;
    }
}
