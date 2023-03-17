/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Left And Right Rotation Of A String
*Problem Source : Coding Ninjas
* 
*/

public class Left_And_Right_Rotation_Of_A_String {

    public static String leftRotate(String str, int d) {

        // Write you code here.

        String s=str+str;

        int I=str.length();

        if(d>I){

            d=d%I;

            String s1=s.substring(d,(I+d));

            return s1+"";

        }

        String s1=s.substring(d,(I+d));

        return s1 +"";

 

        

    }

 

    public static String rightRotate(String str, int d) {

        // Write you code here.

        String s=str+str;

        int I=str.length();

        if(d>I){

            d=d%I;

            int L=s.length();

            String s1=s.substring((I-d),(L-d));

            return s1;

        }

        int L=s.length();

        String s1=s.substring((I-d),(L-d));

        return s1;

    }

    

}
