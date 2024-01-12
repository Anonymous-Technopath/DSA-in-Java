/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Print all Divisors of a number
*Problem Source : Coding Ninjas
* 
*/

import java.util.ArrayList;
import java.util.List;
public class Print_All_Divisors_Of_A_Number{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        return arr;
    }
}
