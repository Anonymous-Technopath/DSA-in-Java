/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : One Odd Occurring
*Problem Source : Coding Ninjas
* 
*/

public class One_Odd_Occurring{
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        int x=0;
        for(int i:arr){
            x=x^i;
        }
        return x;
    }
}
