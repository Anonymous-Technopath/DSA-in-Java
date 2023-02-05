/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find All Anagrams in a String
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/find-all-anagrams-in-a-string/
* 
*/

class Find_All_Anagrams_In_A_String {
    public List<Integer> findAnagrams(String s, String p) {
        int phash[]=new int[26];
        int hash[]=new int[26];
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            phash[p.charAt(i)-'a']++;
        }
        if(s.length()<p.length()){
            return arr;
        }
        for(int i=0;i<p.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(hash,phash)){
            arr.add(0);
        }
        for(int i=1;i<s.length()-p.length()+1;i++){
            hash[s.charAt(i-1)-'a']--;
            hash[s.charAt(i-1+p.length())-'a']++;
            if(Arrays.equals(hash,phash)){
                arr.add(i);
            }
        }
        return arr;
    }
}
