package P43165

class Solution {
    
    fun dfs(numbers: IntArray, target: Int, index: Int): Int {
        return if (numbers.size > index)
            dfs(numbers, target + numbers[index], index + 1) +
            dfs(numbers, target - numbers[index], index + 1)
            else if (target == 0) 1 else 0
    }
    
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0);
    }
}