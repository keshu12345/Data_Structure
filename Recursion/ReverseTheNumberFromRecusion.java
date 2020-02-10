import java.util.Scanner;

public class ReverseTheNumberFromRecusion {
	
	public int reverse(int[] arr1,int n) {
		int i=0;
		int l=arr1.length;
		if(i==l-1) {
			return arr1[l-1];
		}else {
			int data=arr1[i];
			
			int result=reverse(arr1,n-1);
			System.out.println(result);
			System.out.print(data);
		}
		return -1;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseTheNumberFromRecusion rf=new ReverseTheNumberFromRecusion();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		rf.reverse(arr1,n);

	}

}
