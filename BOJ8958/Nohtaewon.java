package BOJ8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Nohtaewon {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int tc=Integer.parseInt(br.readLine());
		String[] ox=new String[tc];

		for(int i=0;i<tc;i++) {
			int jumsu=0;
			int jumsu2=0;
			ox[i]=br.readLine();
			String[] tmp=ox[i].split("");
			for(int j=0;j<tmp.length; j++) {
				if(tmp[j].equals("O")) {
					jumsu2++;
					jumsu+=jumsu2;
				}else {
					jumsu2=0;
				}
				
			}
			bw.write(jumsu+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
