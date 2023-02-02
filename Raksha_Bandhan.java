/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Raksha Bandhan
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/raksha-bandhan_2179752
* 
*/

class Raksha_Bandhan{

    public static int rakshaBandhan(int arr[], int n) {
        // Write your code here.
        Arrays.sort(arr);
        int count=0;
        long sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            if(sum<=0){
                return count;
            }
            count++;
        }
        return count;
    }
}
