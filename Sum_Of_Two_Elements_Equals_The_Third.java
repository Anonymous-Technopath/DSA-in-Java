/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum Of Two Elements Equals The Third
*Problem Source : Coding Ninjas
* 
*/

public class Sum_Of_Two_Elements_Equals_The_Third
{
	public static  ArrayList<Integer> findTriplets(int[] arr, int n) 
    {
	    //Write your code here.
		HashSet<Integer> hs=new HashSet<>();
		ArrayList<Integer> sol=new ArrayList<>();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int sum=arr[i]+arr[j];
				if(hs.contains(sum)){
					sol.add(arr[i]);
					sol.add(arr[j]);
					sol.add(sum);
					return sol;
				}else{
					hs.add(arr[i]);
					hs.add(arr[j]);
				}
			}
		}
		return sol;
	}
}
