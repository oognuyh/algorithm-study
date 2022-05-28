package P92334;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Nohtaewon{
    public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer=new int[id_list.length];
		int[] reportP=new int[id_list.length];
		report=Arrays.stream(report).distinct().toArray(String[]::new);
		
		List<String> idList=Arrays.asList(id_list);
		
		for(String r:report) {
			String[] reportList=r.split(" ");
			reportP[idList.indexOf(reportList[1])]+=1;
		}
        for(String r:report){
            String[] reportList=r.split(" ");
            if(reportP[idList.indexOf(reportList[1])]>=k) {
				answer[idList.indexOf(reportList[0])]+=1;
			}
        }
        return answer;
    }
}
