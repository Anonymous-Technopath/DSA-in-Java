/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum Of Infinite Array
*Problem Source : Coding Ninjas
* 
*/

public class Sum_Of_Infinite_Array {

    static int mod = (int) 1e9 + 7;

    public static long sum (long prefix[], long len, long x) {
        long cnt = (x / len) % mod;
        long res = (cnt * prefix[(int) len]) % mod;
        res = (res + prefix[(int) (x % len)]) % mod;
        return res;    
    }

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> ans = new ArrayList<>(); 
        long prefix[] = new long[n + 1];
        for (int i = 1; i < prefix.length; i++)
            prefix[i] = (arr[i-1] + prefix[i-1]) % mod;
        for (List<Long> range: queries) {
            long l = range.get(0);  
            long r = range.get(1);
            long rsum = sum(prefix, n, r);
            long lsum = sum(prefix, n, l-1);
            int res = (int)(rsum - lsum + mod) % mod;
            ans.add(res);
        }
        return ans; 
    }
}
