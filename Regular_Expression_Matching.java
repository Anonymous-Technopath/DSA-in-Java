/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Regular Expression Matching
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/regular-expression-matching/
* 
*/

import java.util.regex.Pattern;
class Regular_Expression_Matching {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p,s);
    }
}
