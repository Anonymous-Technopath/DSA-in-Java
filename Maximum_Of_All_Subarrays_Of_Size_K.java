/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum of all subarrays of size k
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/
* 
*/

class Maximum_Of_All_Subarrays_Of_Size_K
{
    //Function to find maximum of each subarray of size k.
    
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> sol=new ArrayList<Integer>();
        for(int i=0;i<k-1;i++){
            a.add(arr[i]);
        }
        for(int i=k-1;i<n;i++){
            a.add(arr[i]);
            sol.add(Collections.max(a));
            a.remove(0);
        }
        return sol;
    }
}
