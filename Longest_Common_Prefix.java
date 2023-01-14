/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Common Prefix
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/longest-common-prefix/
* 
*/

class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int l=Integer.MAX_VALUE;
        String x="";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<l){
                l=strs[i].length();
                x=strs[i];
            }
        }

        for(int i=0;i<l;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=x.charAt(i)){
                    return s;
                }
            }
            s=s+x.charAt(i);
        }
        return s;
    }
}
