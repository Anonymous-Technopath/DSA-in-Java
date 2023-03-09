/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Container With Most Water
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/container-with-most-water/
* 
*/

class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while(l<r){
            max = Math.max(max,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
