/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Quicksort using the Dutch national flag algorithm
*Problem Source : Coding Ninjas
* 
*/

public class Quicksort_Using_The_Dutch_National_Flag_Algorithm {
    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> sol=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(!h.containsKey(arr.get(i))){
                h.put(arr.get(i),1);
                x.add(arr.get(i));
            }else{
                h.put(arr.get(i),h.get(arr.get(i))+1);
            }
        }
        Collections.sort(x);
        for(int i=0;i<x.size();i++){
            while(h.get(x.get(i))!=0){
                h.put(x.get(i),h.get(x.get(i))-1);
                sol.add(x.get(i));
            }
        }
        return sol;
    }
}
