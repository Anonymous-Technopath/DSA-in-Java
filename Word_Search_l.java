/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Word Search - l
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Word_Search_l {
    public static boolean rec(char [][]board, String word,int i,int j, int n, int m,HashSet<int[]> hs,int s){
        if(word.equals("")){
            return true;
        }
        {
            if(i!=0){
                int x=i-1,y=j;
                int arr[]=new int[]{x,y};
                if(!hs.contains(arr)&&board[x][y]==word.charAt(0)){
                    hs.add(arr);
                    if(rec(board,word.substring(1,s),x,y,n,m,hs,s-1)){
                        return true;
                    }
                    hs.remove(arr);
                }
            }
        }
        {
            if(j!=0){
                int x=i,y=j-1;
                int arr[]=new int[]{x,y};
                if(!hs.contains(arr)&&board[x][y]==word.charAt(0)){
                    hs.add(arr);
                    if(rec(board,word.substring(1,s),x,y,n,m,hs,s-1)){
                        return true;
                    }
                    hs.remove(arr);
                }
            }
        }
        {
            if(i!=n-1){
                int x=i+1,y=j;
                int arr[]=new int[]{x,y};
                if(!hs.contains(arr)&&board[x][y]==word.charAt(0)){
                    hs.add(arr);
                    if(rec(board,word.substring(1,s),x,y,n,m,hs,s-1)){
                        return true;
                    }
                    hs.remove(arr);
                }
            }
        }
        {
            if(j!=m-1){
                int x=i,y=j+1;
                int arr[]=new int[]{x,y};
                if(!hs.contains(arr)&&board[x][y]==word.charAt(0)){
                    hs.add(arr);
                    if(rec(board,word.substring(1,s),x,y,n,m,hs,s-1)){
                        return true;
                    }
                    hs.remove(arr);
                }
            }
        }
        return false;
    }
    public static boolean present(char [][]board, String word, int n, int m) {
        // Write your code here.
        HashSet<int[]> hs=new HashSet<>();
        int s=word.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int arr[]=new int[]{i,j}; 
                if(board[i][j]==word.charAt(0)){
                    hs.add(arr);
                    if(rec(board,word.substring(1,s),i,j,n,m,hs,s-1)){
                        return true;
                    }
                    hs.remove(arr);
                }
            }
        }
        return false;
    }
}
