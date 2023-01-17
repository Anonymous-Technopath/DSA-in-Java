/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Length of Last Word
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/length-of-last-word/
* 
*/

class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            n++;
        }
        return n;
    }
}
