/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : K-th Element of Two Sorted Arrays
*Problem Source : Coding Ninjas
* 
*/

import java.util.ArrayList;
public class Kth_Element_Of_Two_Sorted_Arrays {

    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int n1, int n2, int k) {
        if(n1>n2){
            return kthElement(b,a,n2,n1,k);
        }
        int low=Math.max(0,k-n2),high=Math.min(k,n1);
        int n=n1+n2;
        while(low<=high){
            int mid1= (low+high)/2;
            int mid2= k- mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1<n1){
                r1=a.get(mid1);
            }
            if(mid2<n2){
                r2=b.get(mid2);
            }
            if(mid1>0){
                l1=a.get(mid1-1);
            }
            if(mid2>0){
                l2=b.get(mid2-1);
            }
            if(l1<=r2 &&l2<=r1){
                return Math.max(l1,l2);
            }else if(l1>r2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }
        return -1;
    }
}
