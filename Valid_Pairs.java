/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Valid Pairs
*Problem Source : Coding Ninjas
* 
*/

public class Valid_Pairs 
{
	public static boolean isValidPair(int[] arr, int n, int k, int m) 
	{
		//Write your code here.
		if(n%2!=0){
			return false;
		}

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(i,0);
        }
   
        for(int i=0;i<n;i++){
            int rem=arr[i]%k;
            int elem=map.get(rem)+1;
            map.put(rem,elem);
        }

        for(int i=0;i<n;i++){
            int r1=map.get(arr[i]%k);
			int r2;
       		if(arr[i]%k<=m)
           		r2=map.get(m-(arr[i]%k));
			else
           		r2=map.get((k-(arr[i]%k))+m);
       		if(r1!=r2)
       		{
           		return false;
       		}
        }
        return true;
	}
}
