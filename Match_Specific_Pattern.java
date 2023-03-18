/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Match Specific Pattern
*Problem Source : Coding Ninjas
* 
*/

public class Match_Specific_Pattern{
    
    public static List<String> matchSpecificPattern(List<String> words, int n, String p) {
        
		// Write you code here.
    HashMap<Character,Character> a;
    HashMap<Character,Character> b;
    List<String> sol=new ArrayList<>();
    for(String s :words){
      a=new HashMap<>();
      b=new HashMap<>();
      if(s.length()!=p.length()){
        continue;
      }
      boolean t=true;
      for(int i=0;i<s.length();i++){
        if(a.containsKey(s.charAt(i))){
          if(a.get(s.charAt(i))!=p.charAt(i)){
            t=false;
            break;
          }
        }else{
          a.put(s.charAt(i),p.charAt(i));
        }
        if(b.containsKey(p.charAt(i))){
          if(b.get(p.charAt(i))!=s.charAt(i)){
            t=false;
            break;
          }
        }else{
          b.put(p.charAt(i),s.charAt(i));
        }
        
      }
      if(t){
        sol.add(s);
      }
      
    }
    return sol;

    }

}
