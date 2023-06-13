/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Smallest Subarray With K Distinct Elements
*Problem Source : Coding Ninjas 
*
*/

import java.util.*;
public class Smallest_Subarray_With_K_Distinct_Elements
{
public static ArrayList<Integer>smallestSubarrayWithKDistinct(ArrayList<Integer> arr, int k)
    {
        // Write your code here
        int n = arr.size();
        int start = 0, end = n;
        ArrayList<Integer>ar = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (j < n)
        {
            map.put(arr.get(j), map.getOrDefault(arr.get(j), 0) + 1);
            j++;
            if (map.size() < k)
                continue;
            while (map.size() == k)
            {
                int windowLen = (j - 1) - i + 1;
                int subArrayLen = end - start + 1;
                if (windowLen < subArrayLen) {
                    start = i;
                    end = j - 1;
                }
                if (map.get(arr.get(i)) == 1)
                    map.remove(arr.get(i));
                else
                    map.put(arr.get(i), map.get(arr.get(i)) - 1);
                i++;
            }
        }
        if (start == 0 && end == n)
        {
            ar.add(-1);
            return ar;
        }
        else
        {
            ar.add(start);
            ar.add(end);
            return ar; 
        }
    }
}
