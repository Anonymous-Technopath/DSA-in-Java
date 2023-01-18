/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Add Binary
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/add-binary/
* 
*/

class Add_Binary {
    public String addBinary(String a, String b) {
        if(a.length()>b.length()){
            while(a.length()!=b.length()){
                b="0"+b;
            }
        }
        else if(b.length()>a.length()){
            while(a.length()!=b.length()){
                a="0"+a;
            }
        }
        int n=a.length();
        char c='0';
        String s="";
        for(int i=n-1;i>=0;i--){
            int one=0;
            if(a.charAt(i)=='1'){
                one++;
            }
            if(b.charAt(i)=='1'){
                one++;
            }
            if(c=='1'){
                one++;
            }
            if(one==0){
                s="0"+s;
                c='0';
            }else if(one==1){
                s="1"+s;
                c='0';
            }else if(one==2){
                s="0"+s;
                c='1';
            }
            else if(one==3){
                s="1"+s;
                c='1';
            }
        }
        if(c=='1'){
            s="1"+s;
        }
        return s;
    }
}
