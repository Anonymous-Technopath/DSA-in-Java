/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse Array In Groups
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/
* 
*/

class Reverse_Array_In_Groups {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        ArrayList<Integer> x=new ArrayList<Integer>();
        int i=0;
        while(i<n){
            for(int j=0;j<k&&i+j<n;j++){
                x.add(arr.get(i+j));
            }
            for(int j=0;j<k&&i+j<n;j++){
                arr.set(i+j,x.get(x.size()-1));
                x.remove(x.size()-1);
            }
            i=i+k;
        }
    }
}
