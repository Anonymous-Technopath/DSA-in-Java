/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Common Elements
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/common-elements1132/
* 
*/

class Common_Elements
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && A[i]==C[k]){
                if(!arr.contains(A[i]))
                arr.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(C[k]<=A[i] && C[k]<=B[j]){
                k++;
            }
            else if(A[i]<=B[j] && A[i]<=C[k]){
                i++;
            }else{
                j++;
            }
        }
        return arr;
    }
}
