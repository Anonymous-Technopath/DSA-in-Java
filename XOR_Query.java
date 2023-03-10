/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : XOR Query
*Problem Source : Coding Ninjas
* 
*/


public class XOR_Query {

	public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries){

		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<int[]> xorQueries = new ArrayList<>();
		xorQueries.add(new int[2]);
		for (ArrayList<Integer> query : queries) {
			if (query.get(0) == 1) {
				result.add(query.get(1));
			} else {
				xorQueries.add(new int[] { query.get(1), result.size() });
			}
		}
		Collections.reverse(xorQueries);
		int[] prevXor = new int[] { 0, result.size() };
		for (int[] xor : xorQueries) {
			for (int j = xor[1]; j < prevXor[1]; j++) {
				result.set(j, result.get(j) ^ prevXor[0]);
			}
			xor[0] ^= prevXor[0];
			prevXor = xor;
		}
		return result;
	}
}
