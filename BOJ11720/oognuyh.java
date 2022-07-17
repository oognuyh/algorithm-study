package BOJ11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class oognuyh {

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      bufferedReader.readLine().trim();

      System.out.println(
          Arrays.stream(bufferedReader.readLine().trim().split(""))
              .mapToInt(Integer::parseInt)
              .sum());
    }
  }
}
