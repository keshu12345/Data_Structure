import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumber {
	
	static int pickingNumbers(List<Integer>a) {
		int freq []=new int[101];
		int result=Integer.MIN_VALUE;
		for(int i=0;i<a.size();i++) {
			 int index=a.get(i);
			 freq[index]++;
		}
		
		for(int i=1;i<=100;i++) {
			result=Math.max(result,freq[i]+freq[i-1]);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	List<Integer>list=new ArrayList<Integer>();
	
while(n-->=0) {
	
	list.add(sc.nextInt());
	
}
int result =pickingNumbers(list);
System.out.println(result);

	}

}
