/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Painter's Partition Problem
*Problem Source : Coding Ninjas
* 
*/

public class Painter_s_Partition_Problem
{
    public static boolean ifPossible(ArrayList<Integer> boards, int k,int mid)
    {
        int painterCount=1;
        int boardSum=0;
        for(int i=0;i<boards.size();i++)
        {
            if(boardSum+boards.get(i)<=mid)
            {
                boardSum+=boards.get(i);
            }
            else
            {
                painterCount++;
                if(painterCount>k || boards.get(i)>mid)
                {
                    return false;
                }
                boardSum=boards.get(i);
            }
            
        }
        return true;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int s=0;
        int sum=0;
        for(int i=0;i<boards.size();i++)
        {
            sum+=boards.get(i);
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
