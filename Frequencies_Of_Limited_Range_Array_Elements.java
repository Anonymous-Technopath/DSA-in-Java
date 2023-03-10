/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Frequencies of Limited Range Array Elements
*Problem Source : Geeks For Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/
* 
*/

class Frequencies_Of_Limited_Range_Array_Elements{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<N;i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],1);
            }else{
                hs.put(arr[i],hs.get(arr[i])+1);
            }
        }
        Arrays.fill(arr,0);
        for(int i=0;i<N;i++){
            if(hs.containsKey(i+1)){
                arr[i]=hs.get(i+1);
            }
        }
    }
}
