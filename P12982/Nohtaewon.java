package P12982;

import java.util.Arrays;

class Solution {
	public int solution(int[] d, int budget) {
		Arrays.sort(d);
		int answer = 0;
		for(int i=0;i<d.length;i++){
			if(d[i]<=budget){
				budget=budget-d[i];
				answer+=1;
			}else{
				break;
			}
		}
		return answer;
	}
}

