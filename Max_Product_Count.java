/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Max Product Count
*Problem Source : Coding Ninjas
* 
*/

public class Max_Product_Count {
    
    public static long[] maxProductCount(int arr[], int n) {
        
        HashMap<BigInteger,Long> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               
                BigInteger num1=BigInteger.valueOf(arr[i]);
                BigInteger num2=BigInteger.valueOf(arr[j]);
                BigInteger bp=num1.multiply(num2);
              
                map.put(bp,map.getOrDefault(bp,0L)+1);
            }
        }
        
        long maxFreq=Long.MIN_VALUE;
        boolean isExists=false;
        for(Map.Entry<BigInteger,Long> entry: map.entrySet()){
            if(entry.getValue()>1){
                isExists=true;
              maxFreq=Math.max(maxFreq,entry.getValue());
            }
        }
        
        BigInteger product=null;
        for(Map.Entry<BigInteger,Long> entry: map.entrySet()){
            if(entry.getValue()==maxFreq){
                if(product==null){
                    product=entry.getKey();
                }else{
                    if(entry.getKey().compareTo(product)==-1){
                        product=entry.getKey();
                    }
                }
                
            }
        }
        
        long combination  = maxFreq*(maxFreq-1)/2;
        if(isExists){
            return new long[]{product.longValue(),combination}; 
        }
        return new long[]{0}; 
    }
}
