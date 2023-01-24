/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Climbing Stairs
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/climbing-stairs/
* 
*/

class Climbing_Stairs{
    public int climbStairs(int n) {
        int a=0,b=1;
        for(int i=0;i<n;i++){
            int temp=a;
            a=b;
            b=temp+b;
        }
        return b;
    }
}
