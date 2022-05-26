package P92334;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};
		answer = new int[id_list.length];

		Map<String, HashSet<String>> idMap = new HashMap<>();
		Map<String, Integer> answerMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportId = new HashSet<>();
			idMap.put(id_list[i], reportId);
			answerMap.put(id_list[i], 0);
		}

		for (String s : report) {
			String[] StrDivide = s.split(" ");
			String reportingID = StrDivide[0];
			String reportedID = StrDivide[1];
			idMap.get(reportedID).add(reportingID);
		}

		for (String reportedUser : idMap.keySet()) {
			HashSet<String> reportingUser = idMap.get(reportedUser);
			if (reportingUser.size() >= k) {
				for (String userId : reportingUser) {
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
