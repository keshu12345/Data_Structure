import java.util.Scanner;

public class BirthdayCakeCandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc =new Scanner (System.in);
		 int n=sc.nextInt();
		 int tallestCandle=0;
		 int countTallestCandle=0;
		 
		 for(int i=0;i<n;i++) {
			 int hight=sc.nextInt();
			 if(hight>tallestCandle) {
				 tallestCandle=hight;
				 countTallestCandle=1;
				 
			 }
			 else if(hight==tallestCandle) {
				 countTallestCandle++;
			 }
		 }
		 System.out.println(countTallestCandle);
	}

}
