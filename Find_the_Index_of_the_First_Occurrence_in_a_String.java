/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find the Index of the First Occurrence in a String
*Problem Source : LeetCode
*Problem Link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
* 
*/

class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public int strStr(String haystack, String needle) {
        StringBuffer sb=new StringBuffer(haystack);
        
        return sb.indexOf(needle);
    }
}
