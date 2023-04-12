/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Contains Duplicate ll
*Problem Source : Coding Ninjas
* 
*/

public class Contains_Duplicate_ll {
    public static boolean checkDuplicate(int[] arr, int n, int k) {
        // Write your code here.
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            
            if(hs.contains(arr[i])){
                return true;
            }
            if(i>=k){
                hs.remove(arr[i-k]);
            }
            hs.add(arr[i]);
        }
        return false;
    }
}
