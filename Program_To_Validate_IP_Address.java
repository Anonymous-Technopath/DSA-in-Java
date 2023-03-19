/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Program to validate IP address
*Problem Source : Coding Ninjas
* 
*/

public class Program_To_Validate_IP_Address {

	public static boolean isValidIPv4(String s) {
		// write your code here
		StringTokenizer st=new StringTokenizer(s, ".");
		String arr[]=new String[4];
		int n=0;
		while(st.hasMoreTokens()){
			if(n==4){
				return false;
			}
			arr[n]=st.nextToken();
			n++;
		}
		if(n!=4){
			return false;
		}
		for(String x :arr){
			try{
				n =Integer.parseInt(x);
				if(n>255 ||n<0){
					return false;
				}
			}catch(Exception e){
				return false;
			}
		}
		return true;
	}

}
