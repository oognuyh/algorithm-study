package P12977;

import kotlin.math.sqrt;

class oognuyh {

    fun solution(nums: IntArray): Int {
        var numOfPrimes = 0;
        val isPrime = BooleanArray(nums.maxOrNull()!! * 3 + 1) { true };

        (2 .. sqrt(isPrime.lastIndex.toDouble()).toInt())
            .filter { number -> isPrime[number] }
            .forEach { number -> (2 * number .. isPrime.lastIndex step number)
                .forEach { multiple -> isPrime[multiple] = false } };

        (0 .. nums.lastIndex)
            .forEach { i -> (i + 1 .. nums.lastIndex)
                .forEach { j -> (j + 1 .. nums.lastIndex)
                    .forEach { k -> if (isPrime[nums[i] + nums[j] + nums[k]])  numOfPrimes++ } } };
        
        return numOfPrimes;
    }
}