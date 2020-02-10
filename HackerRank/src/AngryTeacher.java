import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AngryTeacher {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]<=0){
             count++;
              }
        }
        if(count>=k){
            return "NO";

        }
        else{
            return "YES";
        }

  
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
    	
    	int k=sc.nextInt();
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++) {
    		a[i]=sc.nextInt();
    		
    	}

        String result = angryProfessor(k, a);

      System.out.println(result);



    }

}
