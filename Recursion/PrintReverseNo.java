import java.util.Scanner;

public class PrintReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		PrintReverseNo pr=new PrintReverseNo();
		pr.reverse(n);
	}

	private void reverse(int n) {
		// TODO Auto-generated method stub
		
		if(n>=0) {
			System.out.println(n);
			reverse(n-1);
			
		
		}
		
	}

}
