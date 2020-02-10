import java.util.Scanner;

public class DivisibleSumPair {
	
	static int divisibleSumPairs(int n,int k,int[]ar) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			
			
			for(int j=i+1;j<ar.length;j++) {
			
				if((ar[i]+ar[j])%k==0) {
					count++;
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int ar[]=new int[n];
	
	
	for(int i=0;i<n;i++) {
		ar[i]=sc.nextInt();
		
	    }
	
	 int result = divisibleSumPairs(n, k, ar);
	 System.out.println(result);
	}

}
