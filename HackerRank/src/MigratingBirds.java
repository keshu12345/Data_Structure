import java.util.Arrays;
import java.util.Scanner;

public class MigratingBirds {
	
	public static int migratoryBirds(int[]ar) {
		Arrays.sort(ar);
		return ar[5];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int ar[]=new int[6];
		int arr[]=new int[6];
		
		for(int i=0;i<n;i++) {
			
			int indexOfOther=sc.nextInt();
			ar[indexOfOther]++;
			arr[indexOfOther]++;
			
		}
		int max=migratoryBirds(ar);
		
		for(int i=1;i<6;i++) {
			
			if(arr[i]==max) {
			
				System.out.println(i);
				break;
				
			}
			
			
		}
		
		

	}

}
