/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sudoku Solver
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Sudoku_Solver {
    public static boolean rec(int board[][],int x,int y,ArrayList<HashSet<Integer>> col,ArrayList<HashSet<Integer>> row){
        if(x==9){
            return true;
        }
        while(board[x][y]!=0){
            x=x+((y+1)/9);
            y=(y+1)%9;
            if(x==9){
                return true;
            }
            continue;
        }
        for(int k=1;k<=9;k++){
            if(!col.get(y).contains(k) && !row.get(x).contains(k)){
                board[x][y]=k;
                col.get(y).add(k);
                row.get(x).add(k);
                if(rec(board,x+((y+1)/9),(y+1)%9,col,row)){
                    return true;
                }
                board[x][y]=0;
                col.get(y).remove(k);
                row.get(x).remove(k);
            }
        }
        
        return false;

    }
    public static boolean sudokuSolver(int board[][]){

        /* Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Don't print output and return output as specified in the question.
         */
        int n=9;
        ArrayList<HashSet<Integer>> col=new ArrayList<>(); 
        ArrayList<HashSet<Integer>> row=new ArrayList<>();
        for(int i=0;i<n;i++){
            col.add(new HashSet<>());
            row.add(new HashSet<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!=0 &&(col.get(j).contains(board[i][j])||row.get(i).contains(board[i][j]))){
                    return false;
                }
                col.get(j).add(board[i][j]);
                row.get(i).add(board[i][j]);
            }
        }
        return rec(board,0,0,col,row);

        

    }
}
