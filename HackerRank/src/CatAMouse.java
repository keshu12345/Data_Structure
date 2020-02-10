import java.util.Scanner;

public class CatAMouse {
	static String catAndMouse(int x,int y,int z) {
		
		 int diffA = Math.abs(x-z); //Distance Cat A is from Mouse
         int diffB = Math.abs(y-z); //Distance Cat B is from Mouse
         if(diffA < diffB)
             return"Cat A";
         else if(diffB < diffA)
             return "Cat B";
         else //Equivalent
             return "Mouse C";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0,y=0,z=0;
		for(int i=0;i<n;i++) {
			 x=sc.nextInt();
			 y=sc.nextInt();
			z=sc.nextInt();
			
		}
		
		  String result = catAndMouse(x, y, z);
		  System.out.println(result);
		
	}

}
