package P72410;

class Nohtaewon {
	public String solution(String new_id){
		String answer=new_id;
		answer=answer.toLowerCase();
		answer=answer.replaceAll("[^a-z0-9-_.]","");
		answer=answer.replaceAll("\\.{2,}", ".");
		answer=answer.replaceAll("^\\.|\\.$","");
		if(answer.equals("")) {
			answer="a";
		}
		if(answer.length()>=16) {
			answer=answer.substring(0,15);
			answer=answer.replaceAll("\\.$","");
		}
        while(answer.length()<3){
            answer+=answer.substring(answer.length()-1);
        }
		return answer;
		
	}
}