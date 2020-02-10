import java.util.Scanner;

public class PrintNumber {
	private void print(int n) {
		
		if(n<=0) {
			System.out.print("\nNumber that is given revrse:"+n);
			print(n-1);
			System.out.print("\n Number:"+n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       PrintNumber pn=new PrintNumber();
       pn.print(n);
	}

}
