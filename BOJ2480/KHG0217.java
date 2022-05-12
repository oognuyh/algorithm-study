package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws NumberFormatException, IOException {		   
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(bf.readLine());
		 	 
		 int a =Integer.parseInt(st.nextToken());
		 int b =Integer.parseInt(st.nextToken());
		 int c =Integer.parseInt(st.nextToken());
		 
		
			 if((a==b)&&(a==c)) {
	 	         System.out.println(10000+a*1000);
			 }else if((a==b)||(a==c)) {
	 	         System.out.println(1000+a*100);
	 	 	}else if((b==c)) {
	 	         System.out.println(1000+b*100);
	 	 	}else if((a!=b)&&(a!=c)) {
	 	         int big = (a>b)&&(a>c)?a:(c>b?c:b);
	 	         System.out.println(big*100);
	 	 	}  		 	            		      
	 }
}