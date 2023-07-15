/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Digits
*Problem Source : Coding Ninjas
* 
*/

public class Count_Digits{
    public static int countDigits(int n){
        // Write your code here.
        int count=0,x=n;
        while(x>0){
            if((x%10)!=0&&n%(x%10)==0){
                count++;
            }
            x=x/10;
        }
        return count;
    }
}
