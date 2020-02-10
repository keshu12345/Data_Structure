import java.util.Scanner;

public class BinarySearch {
	
	private int binarySearch(int arr[],int l,int r,int key) {
		
	while(l<=r) {
			int mid=(l+r)/2;
			 if(key==arr[mid]) {
				 return arr[mid];
			 }else if(key< arr[mid]) {
				return binarySearch(arr,l,mid-1,key);
			 }else if(key>arr[mid]) {
				return binarySearch(arr,mid+1,r,key);
			 }
			
		
	}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       int key=sc.nextInt();
       int arr[]=new int[n];
       int l=0;
       int r=arr.length-1;
       
       for(int i=0;i<n;i++) {
    	   
    	   arr[i]=sc.nextInt();
       }
       BinarySearch bs=new BinarySearch();
       System.out.print("\n Key Element:"+ bs.binarySearch(arr,l,r,key));
   
	}

}
