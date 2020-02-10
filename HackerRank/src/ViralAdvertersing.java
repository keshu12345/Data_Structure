import java.util.Scanner;

public class ViralAdvertersing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int likedPeople=2;
		int countLiked=2;
		for(int j=1;j<n;j++) {
			likedPeople=((3*likedPeople)/2);
			
			countLiked+=likedPeople;
			
		}
		System.out.println(countLiked);
	}

}
