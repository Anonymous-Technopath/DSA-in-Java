/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Substring Without Repeating Characters
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
* 
*/

class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
    int result = 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    if(s.length() == 0) return 0;
    
    for(int i = 0, j = 0; i < s.length(); i++) {
        
        char ch = s.charAt(i);
        if(map.containsKey(ch) == true) {
            j = Math.max(j, map.get(ch) + 1);
        }
        
        map.put(ch, i);
        result = Math.max(result, i - j + 1);
    }
    
    return result;
    }
}
