package BOJ8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Nohtaewon {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int tc = Integer.parseInt(br.readLine());

    for (int i = 0; i < tc; i++) {
      int jumsu = 0;
      int jumsu2 = 0;
      String ox = br.readLine();
      for (int j = 0; j < ox.length(); j++) {
        if (ox.charAt(j) == 'O') {
          jumsu2++;
          jumsu += jumsu2;
        } else {
          jumsu2 = 0;
        }
      }
      bw.write(jumsu + "\n");
    }
    bw.close();
    br.close();
  }
}
