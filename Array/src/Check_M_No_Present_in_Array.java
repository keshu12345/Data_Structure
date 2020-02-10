import java.util.Scanner;

public class Check_M_No_Present_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int m=sc.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<a.length;j++) {
			if(m==a[j]) {
				
				System.out.println(true);
			}
			
		}
	}

}
