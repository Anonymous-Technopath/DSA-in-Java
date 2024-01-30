/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Fish Eater
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Fish_Eater{ 
    public static int fishEater(int[] fishes) {
        // Write your code here.
        int max=fishes[0];
        int count=0;
        for(int i:fishes){
            if(i>=max){
                count++;
                max=i;
            }
        }
        return count;
    }
}
