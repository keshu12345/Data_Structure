import java.util.Scanner;

public class factorail {
	private int f(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*f(n-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factorail f=new factorail();
		
		System.out.println(f.f(n));
	

	}

}
