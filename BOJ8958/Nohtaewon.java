package BOJ8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Nohtaewon {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int tc=Integer.parseInt(br.readLine());//�׽�Ʈ ���̽� ���� �Է� ������ tc�� ����
		String[] ox=new String[tc];//�׽�Ʈ ���̽��� OX ���ڿ� �����Ŵ

		for(int i=0;i<tc;i++) {//for ���� ���̽� ���� ��ŭ ����
			int jumsu=0;//�� ���� �ʱ�ȭ
			int jumsu2=0;//���� ���� �ʱ�ȭ
			ox[i]=br.readLine();//�Է¹���
			String[] tmp=ox[i].split("");//�Է� �����ͤ��� ""�� �����ؼ� �迭�� ����
			for(int j=0;j<tmp.length; j++) {// O,X�� �����ؼ� ��������� �ϴµ�
				if(tmp[j].equals("O")) {//tmp�� j��°�� "O" ����
					jumsu2++;//O�϶� �������� �þ
					jumsu+=jumsu2;
				}else {
					jumsu2=0;//�ƴϸ� �׳� 0��
				}
				
			}
			bw.write(jumsu+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
