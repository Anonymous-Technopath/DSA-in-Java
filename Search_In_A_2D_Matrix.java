/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Search In A 2D Matrix
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/search-in-a-2d-matrix_980531
* 
*/

public class Search_In_A_2D_Matrix {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int t) {
		// Write your code here.
		int start=0,end=m-1,mid=(start+end)/2,i=-1;
		try{
			if(mat.get(0).get(0)>t)
				return false;
			for(i=0;i<m;i++){
				if(mat.get(i).get(0)<=t &&mat.get(i).get(n-1)>=t ){
					break;
				}
			}
			start=0;
			end=n-1;
			mid=(start+end)/2;
			while(start<=end){
				if(mat.get(i).get(mid)==t){
					return true;
				}else if(mat.get(i).get(mid)<t){
					start=mid+1;
					mid=(start+end)/2;
				}else{
					end=mid-1;
					mid=(start+end)/2;
				}
			}
			

		}catch(Exception e){
			return false;
		}
		return false;
	}
}
