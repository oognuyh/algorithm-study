package P92334;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class oognuyh {
    
    public int[] solution(String[] id_list, String[] report, int k) {   
        Map<String, Long> numOfEmails = Arrays.stream(report)
            .distinct()
            .collect(Collectors.groupingBy((history) -> history.split(" ")[1], 
                Collectors.mapping((history) -> history.split(" ")[0], Collectors.toList())))
            .entrySet().stream()
            .filter((entry) -> entry.getValue().size() >= k)
            .flatMap((entry) -> entry.getValue().stream())
            .collect(Collectors.groupingBy((id) -> id, Collectors.counting()));
            
        return Arrays.stream(id_list)
            .mapToInt((id) -> numOfEmails.getOrDefault(id, 0L).intValue())
            .toArray();
    }
}
