/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Multiply Strings
*Problem Source : Coding Ninjas
* 
*/

import java.math.BigInteger;

public class Multiply_Strings {

    public static String multiplyStrings(String a, String b) {
        // Write your code here!
        BigInteger x=new BigInteger(a);
        x=x.multiply(new BigInteger(b));
        return x.toString();
    }

}
