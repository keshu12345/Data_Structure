import java.util.Scanner;

public class GCDRecursive {

	private int gcd(int a,int b) {
		if(a==0) {
			return b;
		}else if(b==0) {
			return a;
		}else if(a>b){
			return gcd(a%b, b);
		}else {
			return gcd(a,b%a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     
     GCDRecursive gr=new GCDRecursive();
      System.out.println(gr.gcd(a,b));
	}

}
