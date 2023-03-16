/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Convert String
*Problem Source : Coding Ninjas
* 
*/

public class Convert_String{
	public static String convertString(String str) {
        // Write your code here
        str=" "+str;
        String x="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&&i!=str.length()-1){
                x=x+" "+(str.charAt(i+1)+"").toUpperCase();
                i++;
            }
            else{
                x=x+str.charAt(i);
            }
        }
        return x.substring(1,x.length());
    }

}
