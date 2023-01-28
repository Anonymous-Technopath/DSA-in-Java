/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Selection Sort
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/selection-sort_981162
* 
*/

public class Selection_Sort {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
		}
	}
}
