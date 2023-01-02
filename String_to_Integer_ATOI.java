/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : String to Integer (atoi)
*Problem Source : LeetCode
*Problem Link : https://leetcode.com/problems/string-to-integer-atoi/
* 
*/

class String_to_Integer_ATOI {
    public int myAtoi(String s) {
        String x="";
        boolean t=true;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==' '||s.charAt(i)=='_')&&t){
                continue;
            }
            else if(s.charAt(i)<='9'&& s.charAt(i)>='0'){
                x=x+s.charAt(i);
                t=false;
            }
            else if(s.charAt(i)=='-'&&x.length()==0){
                x="-";
                t=false;
            }
            else if(s.charAt(i)=='+'&&x.length()==0){
                x="+";
                t=false;
            }
            else{
                break;
            }
        }
        if(x.length()==0||(x.length()==1 && (x.charAt(0)=='-'||x.charAt(0)=='+'))){
            return 0;
        }
        try{
            long z=Long.parseLong(x);
            if(z>((int)Math.pow(2,31)-1))
            return (int)Math.pow(2,31);
            if(z<-((int)Math.pow(2,31)))
            return -((int)Math.pow(2,31))-1;
            return Integer.parseInt(x);
        }catch(Exception e){
            if(x.charAt(0)=='-'){
                return -((int)Math.pow(2,31))-1;
            }
            return (int)Math.pow(2,31);
        }
    }
}
