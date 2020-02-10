import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ElectronicShop {
  static int getMoneySpent(int []keyboards,int[] drives,int b) {
	  
	  List<Integer>list=new ArrayList<Integer>();
	  
	  for(int i=0;i<keyboards.length;i++) {
		
		  for(int j=0;j<drives.length;j++) {
			 int sum=keyboards[i]+drives[j];
			  if(sum<=b) {
				  list.add(sum);
			  }
			  
		  }
	  }
	  
	  if(!list.isEmpty()) {
		  Collections.sort(list);
		  return list.get(list.size()-1);
	  }
	  return -1;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		int []keyboards=new int[n];
		int drives []=new int[m];
		for(int i=0;i<n;i++) {
			keyboards[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			drives[i]=sc.nextInt();		
			}
		
		int moneySpent = getMoneySpent(keyboards, drives, b);
		System.out.println(moneySpent);
		

	}

}
