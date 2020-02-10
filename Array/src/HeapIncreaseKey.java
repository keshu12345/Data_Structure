
public class HeapIncreaseKey {
	private static void heapKey(int arr[],int n,int i,int key) {
		if(key>arr[i]) {
			arr[i]=key;
		}
		while(i>0 && arr[i/2]<arr[i]) {
			int temp=arr[i/2];
			arr[i/2]=arr[i];
			arr[i]=temp;
			i=i/2;
		}
		
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int arr[]= {110,30,20,1,3,10,15};
	 int n=arr.length;
	 HeapIncreaseKey hik=new HeapIncreaseKey();
	 hik.heapKey(arr,n,4,400);
	 
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	}

}
