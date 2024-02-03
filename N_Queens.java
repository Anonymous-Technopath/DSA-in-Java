/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : N Queens
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;

public class N_Queens{
    public static void undoConstraints(int arr[][],int x,int y, int n){
        //Constraint on horizontal and vertical line
        for(int i=0;i<n;i++){
            arr[i][y]--;
            arr[x][i]--;
        }

        //Constraint on Left to Right diagonal

        int t1=x-Math.min(x,y);
        int t2=y-Math.min(x,y);

        while(t1<n && t2<n){
            arr[t1][t2]--;
            t1++;
            t2++;
        }

        //Constraint on Right to Left diagonal
        if(x+y==2*(n-1)){
            return;
        }
        else if(x+y<n){
            y=x+y;
            x=0;
        }else{
            int z=(x+y)%(n-1);
            y=(x+y)-z;
            x=z;
        }
        while(x<n && y<n && x>=0 && y>=0){
            arr[x][y]--;
            x++;
            y--;
        }
    }
    public static void constraints(int arr[][],int x,int y, int n){
        //Constraint on horizontal and vertical line
        for(int i=0;i<n;i++){
            arr[i][y]++;
            arr[x][i]++;
        }

        //Constraint on Left to Right diagonal

        int t1=x-Math.min(x,y);
        int t2=y-Math.min(x,y);

        while(t1<n && t2<n){
            arr[t1][t2]++;
            t1++;
            t2++;
        }

        //Constraint on Right to Left diagonal
        if(x+y==2*(n-1)){
            return;
        }
        else if(x+y<n){
            y=x+y;
            x=0;
        }else{
            int z=(x+y)%(n-1);
            y=(x+y)-z;
            x=z;
        }
        while(x<n && y<n && x>=0 && y>=0){
            arr[x][y]++;
            x++;
            y--;
        }
    }
    public static void rec(int arr[][],int n,int x,int count,List<Integer> ans,List<List<Integer>> save){
        if(count==0){
            save.add(new ArrayList<>(ans));
            return;
        }
        for(int j=0;j<n;j++){
            if(arr[x][j]==0){
                ans.add(j);
                constraints(arr, x, j, n);
                rec(arr,n,x+1,count-1,ans,save);
                undoConstraints(arr, x, j, n);
                ans.remove(ans.size()-1);
            }
        }
        
    }
    public static List< List< Integer > > nQueens(int n)
    {
        // Write your code here.
        
        List<List<Integer>> sol=new ArrayList<>();
        List<List<Integer>> save=new ArrayList<>();
        rec(new int[n][n],n,0,n,new ArrayList<>(),save);
        for(List<Integer> i:save){
            List<Integer> arr=new ArrayList<>();
            for(int j:i){
                for(int k=0;k<n;k++){
                    if(k==j){
                        arr.add(1);
                        continue;
                    }
                    arr.add(0);
                }
            }
            sol.add(arr);
        }
        return sol;
    }
}
