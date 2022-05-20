package P72410;

class Nohtaewon {
	public String solution(String new_id){
		new_id=
			new_id
				.toLowerCase();
				.replaceAll("[^a-z0-9-_.]","");
				.replaceAll("\\.{2,}", ".");
				.replaceAll("^\\.|\\.$","");
		if(new_id.equals("")) {
			new_id="a";
		}
		if(new_id.length()>=16) {
			new_id=new_id.substring(0,15).replaceAll("\\.$","");
		}
		if(new_id.length()<=2) {
			char str=new_id.charAt(new_id.length()-1);
			if(new_id.length()==0) {
				return new_id+str+str+str;
			}else if(new_id.length()==1) {
				return new_id+str=str;
			}else{
				return new_id+str;
			}
		}else {
			return answer;
		}
	}
}