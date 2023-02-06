/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Key Pair
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/key-pair5616/
* 
*/

class Key_Pair{
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i:arr){
            if(hs.contains(x-i)){
                return true;
            }else{
                hs.add(i);
            }
        }
        return false;
    }
}
