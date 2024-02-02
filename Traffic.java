/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Traffic
*Problem Source : Coding Ninjas
* 
*/

public class Traffic {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
         // Write your code here.
        int l=0;
        int r=0;
        int maxl=0;
        while(r<n)
        {
            if(vehicle[r]==0)
            {
                m--;
            }
            while(m<0)
            {
                if(vehicle[l]==0)
                {
                m++;
                }
            l++;
        }
        maxl=Math.max(maxl,r-l+1);
        r++;
    }
    return maxl;
    }
}
