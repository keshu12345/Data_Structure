import java.util.Scanner;

public class MaxHeapSort {
	private static void buildHeap(int arr[],int n) {
		for(int i=(n/2)-1;i>=0;i--) {
			maxHeapify(arr,n,i);
		}
	}
	private static void maxHeapify(int arr[],int n,int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[largest]<arr[l]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
		largest=r;
		}
		
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxHeapify(arr,n,largest);
		}
	}
	public static void main(String[] args) {
		// @Keshav Rajput
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]=new int[k];
		
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		MaxHeapSort mhs=new MaxHeapSort();
		mhs.buildHeap(arr,n);
		printHeapArray(arr,n);
		}
	private  static void printHeapArray(int arr[], int n) {
		  System.out.println("Array representation of Heap is:"); 
		  
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	  
	        System.out.println(); 
	}

}
