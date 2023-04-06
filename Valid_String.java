/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Valid String
*Problem Source : Coding Ninjas
* 
*/

public class Valid_String {
	public static boolean checkValidString(String s) {
        // Write your code here.
                int bracket=0;
                if(s.length()==0){
                        return true;
                }
                for(int i=0;i<s.length();i++){
                        if(s.charAt(i)==')'){
                                bracket--;
                        }
                        else{
                                bracket++;
                        }
                        if(bracket<0){
                                return false;
                        }
                }
                if(bracket==0){
                        return true;
                }
                bracket=0;
                for(int i=s.length()-1;i>=0;i--){
                        if(s.charAt(i)=='('){
                                bracket--;
                        }
                        else{
                                bracket++;
                        }
                        if(bracket<0){
                                return false;
                        }
                }
                return true;
        }
}
