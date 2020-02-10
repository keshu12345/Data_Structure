import java.util.Scanner;
public class ExtractMaxHeapElement {
	private static int extractHeapMax(int arr[],int n) {
		if(n<0) {
			System.out.println("No element present in heap");
		}
		int max=Integer.MIN_VALUE;
		max=arr[0];
		arr[0]=arr[n-1];
		n=n-1;
		maxHeapify(arr,n-1,0);
		return n;
	}
 private static void maxHeapify(int[] arr, int n, int i) {
		// @keshav rajput
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
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int k=sc.nextInt();
		int arr[]=new int[k];
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		ExtractMaxHeapElement eme=new ExtractMaxHeapElement();
	    n=eme.extractHeapMax(arr,n);
		System.out.println("Remaing indexes count after deletion ");
		System.out.println(n);
		printHeap(arr,n);

	}
	private static void printHeap(int arr[],int n) {
		System.out.println("After Deletion Array");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
