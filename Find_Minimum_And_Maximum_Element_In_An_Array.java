/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find Minimum And Maximum Element In An Array
*Problem Source : Geeks For Geeks
*Problem Link : https://leetcode.com/problems/add-binary/
* 
*/

class Find_Minimum_And_Maximum_Element_In_An_Array
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        return new pair(min,max);
    }
}
