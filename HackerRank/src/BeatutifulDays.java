import java.util.Scanner;

public class BeatutifulDays {
	static int beautifulDays(int i,int j,int k) {
		 int countDays = 0;
	        
	        for(int x = i; x <= j; x++)
	        {
	            StringBuilder day = new StringBuilder(String.valueOf(x));
	            int xReverse = Integer.parseInt(day.reverse().toString());
	                
	            if(Math.abs(x-xReverse) % k == 0)
	            {
	                countDays++;
	            }
	        }

	return countDays ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		
		 int result = beautifulDays(i, j, k);
		 System.out.println(result);

	}

}
