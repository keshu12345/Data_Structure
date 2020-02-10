import java.util.Scanner;

public class FabinacciRecursive {
	
	private int fabinacci(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1) {
			return n;
		}else {
			return fabinacci(n-1)+fabinacci(n-2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        
        
        FabinacciRecursive fr=new FabinacciRecursive();
        for(int i=0;i<n;i++) {
        	 System.out.print(fr.fabinacci(i)+" ");
        }
       
     
	}

	

}
