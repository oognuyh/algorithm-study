package P17682;

import java.util.Arrays;
import java.util.Map;

public class oognuyh {
    public int solution(String dartResult) {
        Map<Character, Integer> mapper = Map.of(
            'S', 1,
            'D', 2,
            'T', 3,
            '*', 2,
            '#', -1
        );

        int[] scores = new int[3];
        StringBuilder sb = new StringBuilder(dartResult);

        for (int round = 0; round < 3; round++) {
            int endIndex = sb.substring(0, 2).equals("10") ? 2 : 1;
            scores[round] = Integer.parseInt(sb.substring(0, endIndex));
            sb.delete(0, endIndex);

            scores[round] = (int) Math.pow(scores[round], mapper.get(sb.charAt(0)));
            sb.delete(0, 1);

            if (sb.length() > 0 && mapper.containsKey(sb.charAt(0))) {
                scores[round] *= mapper.get(sb.charAt(0));
                if (sb.charAt(0) == '*' && round > 0) scores[round - 1] *= mapper.get(sb.charAt(0));
                sb.delete(0, 1);
            } 
        }        

        return Arrays.stream(scores)
            .sum();
    }
}
