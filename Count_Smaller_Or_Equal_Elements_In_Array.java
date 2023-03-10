/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Smaller or Equal elements in array
*Problem Source : Coding Ninjas
* 
*/

public class Count_Smaller_Or_Equal_Elements_In_Array {
    public static int count(int a[],int value){
        int start=0,end=a.length-1;
        int mid=(start+end)/2;
        int count=0;
        while(start<=end){
            if(a[mid]<=value){
                count=mid+1;
            }
            if(a[mid]>value){
                end=mid-1;
            }else{
                start=mid+1;                
            }
            mid=start +(end-start)/2;
        }
        return count;
    }
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        // Write your code here!
        Arrays.sort(b);
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(count(b,a[i]));
        }
        return arr;
    }
}
