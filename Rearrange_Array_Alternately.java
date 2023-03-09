/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Rearrange Array Alternately
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/
* 
*/

class Rearrange_Array_Alternately{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int lastidx=n-1;
    	int firstidx=0;
    	long maxi=arr[n-1]+1;
    	for(int i=0;i<n;i++)
    	{
    	    if(i%2==0)
    	    {
    	        arr[i]+=(arr[lastidx]%maxi)*maxi;
    	        lastidx--;
    	    }
    	    else
    	    {
    	        arr[i]+=(arr[firstidx]%maxi)*maxi;
    	        firstidx++;
    	    }
    	}
    	for(int i=0;i<n;i++)
    	    arr[i]/=maxi;
        }
    
}
