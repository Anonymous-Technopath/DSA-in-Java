/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Three_Sum
*Problem Source : Coding Ninjas
* 
*/

public class Three_Sum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
		HashSet<ArrayList<Integer>> hs=new HashSet<>();
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			int left=i+1;
			int right=n-1;
			while(left<right){
				int sum =arr[i]+arr[left]+arr[right];
				if(sum==K){
					ArrayList<Integer> x=new ArrayList<>();
					x.add(arr[i]);
					x.add(arr[left]);
					x.add(arr[right]);
					hs.add(x);
					left++;
				}else if(sum<K){
					left++;
				}else{
					right--;
				}
			}
		}
		ArrayList<ArrayList<Integer>> sol=new ArrayList<>();
		sol.addAll(hs);
		return sol;
	}
}
