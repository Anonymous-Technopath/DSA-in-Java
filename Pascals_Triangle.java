/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Pascal's Triangle
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/pascal-s-triangle_1089580
* 
*/

public class Pascals_Triangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>>res= new ArrayList<>();
        
       for(int i=0;i<n;i++)
       {
           ArrayList<Long>in=new ArrayList<>();
           for(int j=0;j<=i;j++)
           {
               if(j==0||j==i)
               {
                   in.add(new Long(1));
               }
               else
               {
                   Long num=res.get(i-1).get(j-1)+res.get(i-1).get(j);
                   in.add(num);
               }
               
           }
           
           res.add(in);
           
       }
        return res;
        
    }
}
