import java.util.Scanner;

public class UtopiaTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 
		 int t=sc.nextInt();
		 
		 for(int i=0;i<t;i++) {
			 int n=sc.nextInt();
			 
			   int h=1;
			 for(int j=1;j<=n;j++) {
				 
				 if(j%2!=0) {
					 h=2*h;
				 }
				 else {
					 h=h+1;
				 }
				 
				}
			 System.out.println(h);
		 }
		 
		 
		 
		 

	}

}
