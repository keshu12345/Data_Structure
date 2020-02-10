import java.util.Scanner;

public class SquareMagicProblem {

	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int s1[][]= {{8,1,6},{3,5,6},{4,9,2}};
		int s2[][]= {{6,1,8},{7,5,3},{2,9,4}};
		int s3[][]= {{8,3,4},{1,5,9},{6,7,2}};
		int s4[][]= {{4,3,8},{9,5,8},{2,7,6}};
		int s5[][]= {{6,7,2},{1,5,9},{8,3,4}};
		int s6[][]= {{2,7,6},{9,5,1},{4,3,8}};
		int s7[][]= {{4,9,2},{3,5,7},{6,1,8}};
		int s8[][]= {{2,9,4},{7,5,3},{6,1,8}};

	
	int diff []=new int[8];  //We will calculate the diff of original matrix and magic matrix
	
	int minDiff=Integer.MIN_VALUE; //variable it store the our min difference
	
     int [][]s=new int[3][3];
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			s[i][j]=sc.nextInt();
			
		diff[0]=Math.abs(s[i][j]-s1[i][j]);
		diff[1]=Math.abs(s[i][j]-s2[i][j]);
		diff[2]=Math.abs(s[i][j]-s3[i][j]);
		diff[3]=Math.abs(s[i][j]-s4[i][j]);
		diff[4]=Math.abs(s[i][j]-s5[i][j]);
		diff[5]=Math.abs(s[i][j]-s6[i][j]);
		diff[6]=Math.abs(s[i][j]-s7[i][j]);
		diff[7]=Math.abs(s[i][j]-s8[i][j]);
			
		}
	}
	for(int i=0;i<diff.length;i++) {
		if(diff[i]>minDiff) {
			minDiff=diff[i];
		}
	}
	}
}


