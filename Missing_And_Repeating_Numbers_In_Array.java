/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Missing And Repeating Numbers
*Problem Source : Coding Ninjas
* 
*/

public class Missing_And_Repeating_Numbers {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        long s1=0L;
        long s2=0L;
        int n=a.length;
        for(long i:a){
            s1+=i;
            s2+=(i*i);
        }
        s1 = s1-(n*(n+1)/2);
        s2 = s2-(n*(n+1)*((2*n)+1)/6);
        s2=s2/s1;
        a=new int[2];
        a[0]=(int)((s1+s2)/2);
        a[1]=(int)s2-a[0];
        return a;
    }
}
