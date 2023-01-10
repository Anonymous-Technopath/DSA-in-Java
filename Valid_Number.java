/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Valid Number
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/valid-number/
* 
*/

class Valid_Number {
    public boolean isNumber(String s) {
        try{
            if(s.equals("Infinity")||s.equals("-Infinity")||s.equals("+Infinity")||s.charAt(s.length()-1)=='f'||s.charAt(s.length()-1)=='D')
            return false;
            double x=Double.parseDouble(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
