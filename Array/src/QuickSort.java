import java.util.Scanner;
public class QuickSort {
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Teken Array from Keyboard");
		printArray(arr);
		QuickSort qs=new QuickSort();
		qs.quickSort(arr,0,arr.length-1);
		System.out.println("\nSorted array");
		printArray(arr);
    }

	private static void quickSort(int[] arr, int low, int hi) {
		if(low<hi) {
			
			int pi=partition(arr,low,hi);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,hi);
		}
	}
  private static int partition(int[] arr, int low, int hi) {
		 int x=arr[hi];
		 int i=low-1;
		 int temp=0;
		 for(int j=low;j<hi;j++) {
			if(arr[j]<=arr[hi]) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		 }
		  temp = arr[i+1]; 
	        arr[i+1] = arr[hi]; 
	        arr[hi] = temp; 
		
		return i+1;
	}

}
