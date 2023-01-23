/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Check If Two Arrays Are Equal Or Not
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/
* 
*/

class Check_If_Two_Arrays_Are_Equal_Or_Not{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < N; i ++) {
             if(A[i] != B[i]) {
                    return false;
                }
        }
        return true;
    }
}
