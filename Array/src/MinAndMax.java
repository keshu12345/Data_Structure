import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int j=0;j<a.length;j++) {
			if(a[j]>max) {
				max=a[j];
			}
			else if(a[j]<min)  {
				min=a[j];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
