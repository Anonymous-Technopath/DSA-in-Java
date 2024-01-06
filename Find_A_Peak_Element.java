/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find A Peak Element
*Problem Source : Coding Ninjas
*/

public class Find_A_Peak_Element {
    public static int peak(int[] arr,int m){
        int start=1;
        int end=m-2;
        if(m==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[m-1]>arr[m-2]){
            return m-1;
        }
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int[] findPeakGrid(int [][]arr){
        // Write your code here.
        int n=arr.length;
        int m=arr[0].length;
        if(n==1 && m==1){
            return new int[]{0,0};
        }
        if(n==1){
            return new int[]{0,peak(arr[0],m)};
        }
        for(int i=0;i<n;i++){
            int j=peak(arr[i],m);
            if(j==-1){
                continue;
            }
            int a=-1,b=-1;
            if(i!=0){
                a=arr[i-1][j];
            }
            if(i!=n-1){
                b=arr[i+1][j];
            }
            if(arr[i][j]>a && arr[i][j]>b){
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
