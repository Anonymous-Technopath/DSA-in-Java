/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Pairs With Given Sum
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/
* 
*/

class Count_Pairs_With_Given_Sum{
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int ans = 0;

        HashMap<Integer, Integer> hs = new HashMap<>();

        

        for(int i=0; i<n; i++){

            if(hs.containsKey(k-arr[i])){

                ans += hs.get(k-arr[i]);

            }

            if(!hs.containsKey(arr[i])){

                hs.put(arr[i],1);

            }

            else{

                hs.put(arr[i],hs.get(arr[i])+1);

            }

        }

        return ans;
    }
}
