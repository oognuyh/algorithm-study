import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { 
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()
    val (a, b, c) = numbers

    println(
        when {
            a == b && b == c -> 10000 + a * 1000
            a == b || a == c || b == c -> 1000 + (if (b == c) b else a) * 100
            else -> numbers.maxOrNull()!! * 100
        }
    )
}