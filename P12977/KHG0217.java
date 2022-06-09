package P12977;

import java.util.Arrays;

class KHG0217 {
	static int answer;
	static boolean primeNumber[] = delete();

	public static boolean[] delete() {
		boolean[] delete = new boolean[2998];

		Arrays.fill(delete, true);

		delete[0] = delete[1] = false;

		for (int i = 2; i * i < delete.length; i++) {
			if (delete[i]) {
				for (int j = 2; i * j < delete.length; j++) {
					delete[i * j] = false;
				}
			}
		}
		return delete;

	}

	public static int solution(int[] nums) {
		int[] result = new int[3];
		combination(0, 0, nums, result);
		return answer;
	}

	public static void combination(int cnt, int idx, int[] nums, int[] result) {

		if (cnt == 3) {
			if (primeNumber[result[0] + result[1] + result[2]])
				answer++;
			return;
		}

		for (int i = idx; i < nums.length; i++) {
			result[cnt] = nums[i];
			combination(cnt + 1, i + 1, nums, result);
		}
	}

}
