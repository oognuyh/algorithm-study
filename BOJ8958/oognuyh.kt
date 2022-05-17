package BOJ8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    (1..readLine().toInt())
    .map { readLine() }
    .map { ox ->
        var sum = if (ox[0] == 'O') 1 else 0
        var acc = sum

        for (i: Int in 1 until ox.length) {
            if (ox[i] == 'O') {
                acc += 1
                sum += acc
            } else {
                acc = 0
            }
        }

        sum
    }.forEach { println(it) }
}