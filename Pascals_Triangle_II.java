/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Pascal's Triangle II
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/pascals-triangle-ii/
* 
*/

class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        if(rowIndex==0){
            return a;
        }
        arr.add(a);
        a=new ArrayList<Integer>();
        a.add(1);
        a.add(1);
        if(rowIndex==1){
            return a;
        }
        arr.add(a);
        for(int i=2;i<=rowIndex;i++){
            a=new ArrayList<Integer>();
            a.add(1);
            for(int j=0;j<arr.get(i-1).size()-1;j++){
                a.add(arr.get(i-1).get(j)+arr.get(i-1).get(j+1));
            }
            a.add(1);
            arr.add(a);
        }
        return a;
    }
}
