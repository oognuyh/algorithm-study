package P92334;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class KHG0217 {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};
		answer = new int[id_list.length];

		Map<String, HashSet<String>> idMap = new HashMap<>();
		Map<String, Integer> answerMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportingId = new HashSet<>();
			idMap.put(id_list[i], reportingId);
			answerMap.put(id_list[i], 0);
		}

		for (String s : report) {
			String[] strDivide = s.split(" ");
			String reportingId = StrDivide[0];
			String reportedId = StrDivide[1];
			idMap.get(reportedId).add(reportingId);
		}

		for (String reportedId : idMap.keySet()) {
			HashSet<String> reportingId = idMap.get(reportedId);
			if (reportingId.size() >= k) {
				for (String userId : reportingId) {
					answerMap.put(userId, answerMap.get(userId) + 1);
				}
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]);
		}

		return answer;
	}

}
