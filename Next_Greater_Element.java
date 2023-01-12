/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Next Greater Element
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/
* 
*/

class Next_Greater_Element
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] sol=new long[n];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++){
            if(st.size()==0){
                st.push(i);
            }
            else if(arr[i]<=arr[st.peek()]){
                st.push(i);
            }else{
                sol[st.peek()]=arr[i];
                st.pop();
                i--;
            }
        }
        while(st.size()>0){
            sol[st.peek()]=-1;
            st.pop();
        }
        return sol;
    } 
}
