/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Three Pointer
*Problem Source : Coding Ninjas
* 
*/

public class Three_Pointer {
    public static int threePointer(ArrayList<Integer> X, ArrayList<Integer> Y, ArrayList<Integer> Z) {
        // Write your code here.
        int A=X.size(),B=Y.size(),C=Z.size();
        int i=0,j=0,k=0,min=Integer.MAX_VALUE;
        while(i<A && j<B && k<C){
            int x = Math.abs(X.get(i)-Y.get(j));
            int y = Math.abs(Y.get(j)-Z.get(k));
            int z = Math.abs(Z.get(k)-X.get(i));
            min=Math.min(min,Math.max(x,Math.max(y, z)));
            if(X.get(i)<=Y.get(j) && X.get(i)<=Z.get(k) ){
                i++;
            }
            else if(Y.get(j)<=Z.get(k) && Y.get(j)<=X.get(i) ){
                j++;
            }
            else{
                k++;
            }
        }
        return min;
    }
};
