/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Merge Sort
*Problem Source : Coding Ninjas
* 
*/

public class Merge_Sort {

	public static void merge(int arr[],int s,int mid ,int e){
		int n1 = mid-s+1;
		int n2 = e-mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i = 0 ; i < n1 ; i++)left[i]=arr[i+s];
		for(int i = 0; i < n2 ; i++)right[i]=arr[i+mid+1];
		int i =0;
		int j =0;
		int k = s;
		while(i < n1 && j < n2){
			if(left[i] < right[j])arr[k++]=left[i++];
			else arr[k++]=right[j++];
		}
		while(i < n1)arr[k++]=left[i++];
		while(j < n2)arr[k++]=right[j++];
	}
	public static void mergersort(int arr[],int s,int e){
		if(s >= e)return;
		int mid = s+(e-s)/2;
		mergersort(arr, s, mid);
		mergersort(arr, mid+1, e);
		merge(arr,s,mid,e);
	}
	public static void mergeSort(int[] arr, int n) {
		// Write your code here.
		mergersort(arr,0,n-1);
	}
}
