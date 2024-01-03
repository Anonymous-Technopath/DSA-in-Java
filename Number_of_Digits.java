/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Number of Digits
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 

public class Number_of_Digits {
    static int countDigit(long x) {
        // Write your code here.
        int count=0;
        while(x>0){
            count++;
            x=x/10;
        }
        return count;
    }
}
