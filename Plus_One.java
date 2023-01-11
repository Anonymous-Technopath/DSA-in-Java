/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Plus One
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/plus-one/
* 
*/

class Plus_One {
    public int[] plusOne(int[] digits) {
        int n;
        boolean x=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
                x= false;
                break;
            }
        }
        if(x){
            n=digits.length+1;
            int arr[]=new int[n];
            arr[0]=1;
            return arr;
        }
        n=digits.length;
        int arr[]=new int[n];
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(carry!=0){
                arr[i]=digits[i]+carry;
                carry=arr[i]/10;
                arr[i]=arr[i]%10;
            }else{
                arr[i]=digits[i];
            }
        }
        return arr;
    }
}
