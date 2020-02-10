import java.util.Scanner;

public class MinHeap {
	private static void buildHeap(int arr[],int n) {
		for(int i=(n/2)-1;i>=0;i--) {
			minHeapify(arr,n,i);
		}
	}
	
	private static void  minHeapify(int arr[],int n,int i) {
		int smallest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[smallest]>arr[l]) {
			smallest=l;
		}
		
		if(r<n && arr[r]<arr[smallest]) {
			smallest=r;
		}
		
		if(smallest!=i) {
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
			minHeapify(arr,n,smallest);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]=new int [k];
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
			}
		int n=arr.length;
		MinHeap mh= new MinHeap();
		mh.buildHeap(arr,n);
		printMinHeap(arr,n);
		

	}
	private static void printMinHeap(int arr[],int n) {
		System.out.println("This is min Heap :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
