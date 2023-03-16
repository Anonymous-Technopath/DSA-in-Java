/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Majority_Element_II
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/majority-element-ii_893027
* 
*/

public class Majority_Element_II
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i : arr){
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
            else{
                hs.put(i,1);
            }
            if(!a.contains(i)){
                if(hs.get(i)>arr.size()/3){
                    a.add(i);
                }
            }
        }
        return a;
    }
}
