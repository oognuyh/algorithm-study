package BOJ8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KHG0217 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {

      int jumsu = 0;
      int sum = 0;
      String s = br.readLine();
      for (int j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        if (c == 'O') {
          jumsu += ++sum;
        } else {
          sum = 0;
        }
      }
      System.out.println(jumsu);
    }
  }
}

