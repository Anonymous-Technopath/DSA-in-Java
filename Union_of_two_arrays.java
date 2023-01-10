/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Union of two arrays
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/
* 
*/

class Union_of_two_arrays{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> arr=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            arr.add(a[i]);
        }
        for(int i=0;i<m;i++){
            arr.add(b[i]);
        }
        return arr.size();
    }
}
