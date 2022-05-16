import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KHG0217 {
	 public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int a=Integer.parseInt(br.readLine());		

		if(a!=0) {			
			for(int i=0; i<a; i++) {			
				boolean b=false;
				int jumsu=0;
				int sum=0;
				String s=br.readLine();			
				String[] array_word;
				array_word = s.split("");
				for(int i1=0; i1<array_word.length; i1++) {																								
					if(b=array_word[i1].equals("O")) {				
						sum++;
						jumsu=jumsu+sum;
					}else {
							sum=0;
					 }						
				}
				System.out.println(jumsu);
				jumsu=0;
				sum=0;
			}					
		}else {
			return;
		 }	   
	}
		
}