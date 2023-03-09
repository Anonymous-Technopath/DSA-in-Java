/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Form a Triangle
*Problem Source : Coding Ninjas
* 
*/

public class Form_A_Triangle{
	
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		// Write your code here.
		if(arr.size()<3){
			return false;
		}
		Collections.sort(arr);
		for(int i=0; i<arr.size()-2 ; i++)
        {
            if((arr.get(i) + arr.get(i+1) > arr.get(i+2)) &&
                (arr.get(i+1) + arr.get(i+2) > arr.get(i)) &&
                (arr.get(i+2) + arr.get(i) > arr.get(i+1)))
                 return true;
        }
        return false;
	}
}
