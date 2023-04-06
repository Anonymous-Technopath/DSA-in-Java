/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Consecutive Duplicates From String
*Problem Source : Coding Ninjas
* 
*/

public class Remove_Consecutive_Duplicates_From_String
{
    public static String removeConsecutive(StringBuilder str) 
    {
        // Write your code here
        StringBuilder sb=new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==sb.charAt(sb.length()-1)){
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString().substring(1,sb.length());
    }
}
