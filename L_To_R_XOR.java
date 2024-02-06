/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : L to R XOR
*Problem Source : Coding Ninjas
* 
*/

public class L_To_R_XOR {
    public static int findXOR(int L, int R){
        // Write your code here.
        return xor(L-1)^xor(R);
    }
    public static int xor(int n){
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }else if (n%4==2){
            return n+1;
        }
        return 0;
    }
}
