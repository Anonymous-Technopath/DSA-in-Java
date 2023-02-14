/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Row with max 1s
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/
* 
*/

class Row_With_Max_1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(m-1-j<=max){
                    break;
                }
                if(arr[i][j]==1){
                    if(m-1-j>max){
                        max=m-1-j;
                        index=i;
                        break;
                    }
                }
            }
        }
        return index;
    }
}
