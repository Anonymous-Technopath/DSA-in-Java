/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Number of occurrence
*Problem Source : Coding Ninjas
* 
*/

public class Number_Of_Occurrence{
    public static int floor(int n, int x, int[] arr){
        int start=0,end=n-1;
        int mid = start+(end-start)/2;
        try{
            while(start<=end){
                mid = start+(end-start)/2;
                if(arr[mid]<=x){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            if(arr[end]!=x)
                return -1;
        }catch(Exception e){
            return -1;
        }
        return end;
    }
    public static int ceil(int n, int x, int[] arr){
        int start=0,end=n-1;
        int mid = start+(end-start)/2;
        try{
            while(start<=end){
                mid = start+(end-start)/2;
                if(arr[mid]>=x){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            if(arr[start]!=x)
                return -1;
        }catch(Exception e){
            return -1;
        }
        return start;
    }
    public static int count(int arr[], int n, int x) {
        int f=floor(n,x,arr);
        if(f==-1){
            return 0;
        }
        return f-ceil(n,x,arr)+1;
    }
}
