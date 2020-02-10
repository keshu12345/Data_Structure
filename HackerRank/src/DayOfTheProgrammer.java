import java.util.Scanner;

public class DayOfTheProgrammer {
	
	 static String dayOfProgrammer(int year) {
		 if(year==1918) {
			 return "26.09.1918";
		 }
		 else if(((year<=1917)&&(year%4==0))||((year%400==0)||((year%4==0)&&(year%100!=0)))) 
			 return "12.09."+year;
	    else
	    	return "13.09."+year;
			 
		 


	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
      String result=dayOfProgrammer(year);
      System.out.println(result);
	}

}
