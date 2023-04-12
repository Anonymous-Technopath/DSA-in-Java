/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Equilibrium Indices Of A Sequence
*Problem Source : Coding Ninjas
* 
*/

public class Equilibrium_Indices_Of_A_Sequence {
    
    public static ArrayList<Integer> findEquilibriumIndices(int[] sequence) {
        // Write your code here.
        int[] postSum=new int[sequence.length];
        int[] preSum=new int[sequence.length];
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=sequence.length-2;i>=0;i--){
            postSum[i]=postSum[i+1]+sequence[i+1];
        }
        for(int i=1;i<sequence.length;i++){
            preSum[i]=preSum[i-1]+sequence[i-1];
        }
        for(int i=0;i<sequence.length;i++){
            if(preSum[i]==postSum[i]){
                arr.add(i);
            }
        }
        return arr;
    }
    
}
