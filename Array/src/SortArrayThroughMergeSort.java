import java.util.Scanner;
public class SortArrayThroughMergeSort {
	private void sort(int arr[] , int l, int r) { 
		  
if(l<r) { 
	  int m=(l+r)/2;
	  sort(arr,l,m);
	 sort(arr,m+1,r);
	 merge(arr,l,m,r);
	 }
	  }
 private void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[i + l];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = l; k <= r; k++) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
		}
}
static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Given Array");
		printArray(arr);
		SortArrayThroughMergeSort ob = new SortArrayThroughMergeSort();
		ob.sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
		printArray(arr);
     }
}
