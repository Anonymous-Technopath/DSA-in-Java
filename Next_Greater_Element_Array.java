/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem :  Next Greater Element
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class  Next_Greater_Element_Array
{
    public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> arr, int n)
    {
        // Write your code here.
        Stack<Integer> s=new Stack<>();
        int sol[]=new int[n];
        Arrays.fill(sol,-1);
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                s.push(i);
            }else if(arr.get(i)>arr.get(s.peek())){
                while(!s.isEmpty()&&arr.get(i)>arr.get(s.peek())){
                    sol[s.pop()]=arr.get(i);
                }
                s.push(i);
            }else{
                s.push(i);
            }
        }
        ArrayList<Integer> x=new ArrayList<>();
        for(int i:sol){
            x.add(i);
        }
        return x;
    }
}
