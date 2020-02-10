import java.util.Scanner;

public class HeapSort {
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 1; i <= n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Teken Array from Keyboard");
		printArray(arr);
		HeapSort hs=new HeapSort();
		hs.buildHeap(arr);
		System.out.println("\nSorted array");
		printArray(arr);

	}
   private void buildHeap(int[] arr) {
	
		int n=arr.length;
		 for(int i=(n/2);i>=1;i--) {
			 heapify(arr,i,n);
		 }
		
	}
	private void heapify(int[] arr, int i,int n) {
		int largest=i;
		int l=2*i;
		int r=2*i+1;
	if(l<=n && arr[largest]<arr[l]) {
			largest=l;
			}
		else {
			largest=i;
		}
		if(r<=n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,largest,n);
		}
		
	
		
	}

}
