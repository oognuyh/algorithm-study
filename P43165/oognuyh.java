package P43165;

public class oognuyh {

  public int dfs(int[] numbers, int target, int index) {
    return index < numbers.length
        ? dfs(numbers, target - numbers[index], index + 1)
            + dfs(numbers, target + numbers[index], index + 1)
        : target == 0 ? 1 : 0;
  }

  public int solution(int[] numbers, int target) {
    return dfs(numbers, target, 0);
  }
}
