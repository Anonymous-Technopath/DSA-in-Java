/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Allocate minimum number of pages
*Problem Source : Geeks For Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
* 
*/

public class Allocate_Minimum_Number_Of_Pages
{
    public static boolean ifPossible(int[] boards, int k,int mid)
    {
        int painterCount=1;
        int boardSum=0;
        for(int i=0;i<boards.length;i++)
        {
            if(boardSum+boards[i]<=mid)
            {
                boardSum+=boards[i];
            }
            else
            {
                painterCount++;
                if(painterCount>k || boards[i]>mid)
                {
                    return false;
                }
                boardSum=boards[i];
            }
            
        }
        return true;
    }
    public static int findPages(int[] boards,int N, int k)
    {
        if(k>N)
        {
            return -1;
        }
        //    Write your code here.
        int s=0;
        int sum=0;
        for(int i=0;i<boards.length;i++)
        {
            sum+=boards[i];
        }
        int e=sum;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e)
        {
            if(ifPossible(boards,k,mid))
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
            mid=s+(e-s)/2;

        }
        return ans;
       
    }
}
