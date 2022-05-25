package P17682;

class Nohtaewon {
	public int solution(String dartResult) {
		int answer=0;
		String dart=dartResult;
		int index=0;
		String numstr="";
		int[] score=new int[3];
		
		for(int i=0; i<dart.length();i++) {
			char c=dart.charAt(i);

			if(c>='0'&&c<='9') {
				numstr+=String.valueOf(c);
			}
			else if(c=='S'||c=='D'||c=='T') {
				int num=Integer.parseInt(numstr);
				
				if(c=='S') num=(int) Math.pow(num, 1);
				else if(c=='D') num=(int) Math.pow(num, 2);
				else num=(int) Math.pow(num, 3);
				
				score[index++]=num;
				numstr="";
			}else {
				if(c=='*') {
					score[index-1]*=2;
					if(index-2>=0) score[index-2]*=2;
				}else {
					score[index-1]*=(-1);
				}
			}
		}
		for(int dartNum:score) {
			answer+=dartNum;
		}
		return answer;
	}
}
