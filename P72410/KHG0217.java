package P72410;

class KHG0217 {
    public String solution(String new_id) {
        String str = new_id;
        str=str.toLowerCase();
        str=str.replaceAll("[^a-z0-9-_.]", "");
        str=str.replaceAll("\\.{2,}",".");
        str=str.replaceAll("^\\.|\\.$", "");
        
        if(str.isEmpty()){
           str="a";
        }
        
        if(str.length()>=16){
           str=str.substring(0,15).replaceAll("\\.$","");
        }
        
        if(str.length()<=2){           
			while(str.length()<=2) {
				str =str.concat(str.substring(str.length()-1));
			}			
		}
        return str;
    } 
}



