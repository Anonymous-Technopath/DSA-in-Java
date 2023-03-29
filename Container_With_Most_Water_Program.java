/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Container With Most Water
*Problem Source : Coding Ninjas
* 
*/

public class Container_With_Most_Water_Program {

	public static int maxArea(int[] height) {
	    // Write your code here.
		int l=0,r=height.length-1;
		int sum=0;
		while(l<r){
			int x = Math.min(height[l],height[r]);
			sum = Math.max(sum,x*(r-l));
			if(height[l]<=x && l<r){
				l++;
			}
			else{
				r--;
			}
		}
		return sum;
	}
}
