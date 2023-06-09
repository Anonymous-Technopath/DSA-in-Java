/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum of All Subarrays of Size K
*Problem Source : Coding Ninja
* 
*/

import java.util.* ;
import java.io.*; 
public class Maximum_of_All_Subarrays_of_Size_K {
    public static Deque<Integer> Operation(Deque<Integer> deque,int[] arr,int i){
        if(deque.isEmpty()){
            deque.addFirst(i);
        }else if(arr[deque.getFirst()]<arr[i]){
            deque =new LinkedList<>();
            deque.addFirst(i);
        }else{
            while(!deque.isEmpty() && arr[deque.getLast()]<=arr[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        return deque;
    }
    public static List<Integer> maximumInAllSubarraysOfSizeK(int[] arr, int n, int k) {
        // Write your code here!
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<k;i++){
            deque=Operation(deque, arr, i);
        }
        List<Integer> sol=new ArrayList<>();
        sol.add(arr[deque.getFirst()]);
        for(int i=k;i<n;i++){
            if(deque.getFirst()<=i-k){
                deque.removeFirst();
            }
            deque = Operation(deque, arr, i);
            sol.add(arr[deque.getFirst()]);
        }
        return sol;
    }
}
