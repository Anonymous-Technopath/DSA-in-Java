/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Spirally Traversing A Matrix
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/
* 
*/

class Spirally_Traversing_A_Matrix
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int startrow=0,endrow=r-1,x=0,y=r*c;
        int startcol=0,endcol=c-1;
        while(x<y){
            if(x<y)
            for(int i=startcol;i<=endcol;i++){
                x++;
                arr.add(matrix[startrow][i]);
            }
            startrow++;
            if(x<y)
            for(int i=startrow;i<=endrow;i++){
                arr.add(matrix[i][endcol]);
                x++;
            }
            endcol--;
            if(x<y)
            for(int i=endcol;i>=startcol;i--){
                arr.add(matrix[endrow][i]);
                x++;
            }
            endrow--;
            if(x<y)
            for(int i=endrow;i>=startrow;i--){
                arr.add(matrix[i][startcol]);
                x++;
            }
            startcol++;
        }
        return arr;
    }
}
