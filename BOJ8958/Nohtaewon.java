package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int tc=Integer.parseInt(br.readLine());//테스트 케이스 개수 입력 받은걸 tc에 넣음
		String[] ox=new String[tc];//테스트 케이스에 OX 문자열 저장시킴

		for(int i=0;i<tc;i++) {//for 문을 케이스 개수 만큼 돌림
			int jumsu=0;//총 점수 초기화
			int jumsu2=0;//연속 점수 초기화
			ox[i]=br.readLine();//입력받음
			String[] tmp=ox[i].split("");//입력 받은것ㅇ믈 ""로 구분해서 배열에 넣음
			for(int j=0;j<tmp.length; j++) {// O,X를 구분해서 점수낼라고 하는데
				if(tmp[j].equals("O")) {//tmp의 j번째가 "O" 인지
					jumsu2++;//O일때 연속점수 늘어남
					jumsu+=jumsu2;
				}else {
					jumsu2=0;//아니면 그냥 0점
				}
				
			}
			bw.write(jumsu+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
