package P12982;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class KHG0217 {
  public int solution(int[] d, int budget) {
    int answer = 0;
    List<Integer> set1 = new ArrayList<>();
    for (int i = 0; i < d.length; i++) {
      set1.add(d[i]);
    }

    Collections.sort(set1);

    for (int i = 0; i < set1.size(); i++) {
      if (budget - set1.get(i) >= 0) {
        budget = budget - set1.get(i);
        answer++;
      }
    }
    return answer;
  }
}
