/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Array Subset Of Another Array
*Problem Source : Geeks For Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/
* 
*/

class Array_Subset_Of_Another_Array {
    public String isSubset( long a1[], long a2[], long n, long m) {
        if(m>n){
            return "No";
        }
        HashMap<Long,Long> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hs.containsKey(a1[i])){
                hs.put(a1[i],hs.get(a1[i])+1);
            }else{
                hs.put(a1[i],(long)1);
            }
        }
        for(int i=0;i<m;i++){
            if(hs.containsKey(a2[i])){
                if(hs.get(a2[i])==0){
                    return "No";
                }
                hs.put(a2[i],hs.get(a2[i])-1);
            }else{
                return "No";
            }
        }
        return "Yes";
        
    }
}
