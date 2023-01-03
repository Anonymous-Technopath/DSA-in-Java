/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Majority Element
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/majority-element-1587115620
* 
*/

class Majority_Element
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int x=size/2;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<size;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i]) + 1);
            }else{
                hm.put(a[i],1);
            }
            if(hm.get(a[i])>x)
                return a[i];
        }
        return -1;
    }
}
