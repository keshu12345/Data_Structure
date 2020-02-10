import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int s=sc.nextInt();
			int rem=m%n;
			if((rem+s-1)%n==0) {
				System.out.println(n);
				}
			else {
				System.out.println((rem+s-1)%n);
			}
		}

	}

}
