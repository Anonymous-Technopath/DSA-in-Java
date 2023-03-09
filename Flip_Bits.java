/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Flip Bits
*Problem Source : Coding Ninjas
* 
*/

public class Flip_Bits {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
		int count=0,sum=0,max=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				sum++;
			}else{
				sum--;
			}
			if(sum<0){
				sum=0;
			}
			if(arr[i]==1){
				count++;
			}
			max=Math.max(sum,max);
			
		}
		return max+count;
	}
}
