package BOJ8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

class oognuyh {

    public static void main(String[] args) throws IOException {
        try (
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int numOfCases = Integer.parseInt(bufferedReader.readLine().trim());
            int[] acc = new int[] { 0 };

            for (int i = 0; i < numOfCases; i++) {
                String ox = bufferedReader.readLine().trim();

                bufferedWriter.write(
                    IntStream
                        .range(0, ox.length())
                        .map((j) -> {
                            acc[0] = ox.charAt(j) == 'O' ?
                                acc[0] + 1 :
                                0;
                            return acc[0];
                        })
                        .sum() + "\n"
                );

                acc[0] = 0;
            }
        }
    }
}