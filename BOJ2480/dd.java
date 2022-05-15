import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dd {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
    int maximum = Integer.MIN_VALUE;
        int numbers[] = new int[3];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(tokenizer.nextToken());
      if (numbers[i] > maximum) maximum = numbers[i];
    }

    if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
      System.out.println(10000 + numbers[0] * 1000);
    } else if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
      System.out.println(1000 + numbers[numbers[1] == numbers[2] ? 1 : 0] * 100);
    } else {
      System.out.println(maximum * 100);
    }
  }
}
