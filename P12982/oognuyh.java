package P12982;

import java.util.Arrays;

class oognuyh {

    public int solution(int[] d, int budget) {
        int[] total = { 0 };

        return (int) Arrays.stream(d)
            .sorted()
            .takeWhile((amount) -> (total[0] += amount) <= budget)
            .count();
    }
}