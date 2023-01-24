/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Next Smaller Element
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/next-smaller-element_1112581
* 
*/

public class Next_Smaller_Element{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(-1);
        }
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                while(!stack.isEmpty() &&arr.get(stack.peek())>arr.get(i)){
                    a.set(stack.peek(),arr.get(i));
                    stack.pop();
                }
                stack.push(i);
            }


        }
        return a;
    }
}
