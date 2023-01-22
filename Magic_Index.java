/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Magic Index
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/magic-index_1199229
* 
*/

public class Magic_Index {
    public static int magicIndex(ArrayList<Integer> a, int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            if(a.get(i)==i)
            return i;
        }
        return -1;
    }
}
