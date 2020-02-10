import java.util.Scanner;

public class BreakingRecords {
	
	
	public static int[] breakingRecords(int []scores){
		int min=scores[0];
		int max=scores[0];
		int minCount=0;
		int maxCount=0;
		for(int s:scores) {
			if(s<min) {
				min=s;
				minCount++;
			}
			if(s>max) {
				max=s;
				maxCount++;
			}
		}
		return new int[] {minCount,maxCount};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []scores=new int[n];
		
		for(int i=0;i<n;i++) {
			scores[i]=sc.nextInt();		
			}
		int [] result=breakingRecords(scores);
		for(int i=0;i<result.length;i++) {
			
		System.out.print(result[i]+(i!=result.length?"":""));
		}
		
		System.out.println("");
		sc.close();

	}

}
