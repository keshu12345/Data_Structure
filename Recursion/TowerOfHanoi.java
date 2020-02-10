import java.util.Scanner;

public class TowerOfHanoi {
	private void tower(int n,String source,String desti,String auxi) {
		if(n==1) {
			System.out.println("Move from "+source+" to "+desti);
		}else {
			tower(n-1,source,auxi,desti);
			System.out.println("Move from "+source+" to "+desti);
			
			tower(n-1,auxi,desti,source);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int disk=sc.nextInt();
		String str1=sc.next();
		String str2=sc.next();
		String str3=sc.next();
		TowerOfHanoi th=new TowerOfHanoi();
		
		th.tower(disk,str1,str2,str3);

	}

}
