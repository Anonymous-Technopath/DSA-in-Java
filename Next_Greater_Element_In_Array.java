/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Next Greater Element
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/next-greater-element_799354
* 
*/

public class Next_Greater_Element_In_Array{
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer> s=new Stack<Integer>();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			if(s.isEmpty()){
				s.push(i);
				continue;
			}
			if(arr[s.peek()]<arr[i]){
				int x=s.peek();
				s.pop();
				a[x]=arr[i];
				i--;
				continue;
			}else{
				s.push(i);
			}
		}
		while(!s.isEmpty()){
			a[s.peek()]=-1;
			s.pop();
		}
		return a;
	}

}
