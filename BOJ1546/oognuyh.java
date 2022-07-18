package BOJ1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class oognuyh {

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      bufferedReader.readLine();
      IntSummaryStatistics summary =
          Arrays.stream(bufferedReader.readLine().trim().split(" "))
              .mapToInt(Integer::parseInt)
              .summaryStatistics();

      System.out.println(summary.getAverage() / summary.getMax() * 100);
    }
  }
}
