package P12977;

class Nohtaewon{
    public int solution(int[] nums) {
		int answer=0;
		boolean[] remove=new boolean[2998];
		remove[0]=remove[1]=true;
		for(int i=2;i*i<2998;i++) {
			if(!remove[i]) {
				for(int j=i+i;j<2998;j+=i) {
					remove[j]=true;
				}
			}
		}
		for(int i=0; i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(!remove[nums[i]+nums[j]+nums[k]]) answer++;
				}
			}
		}
		return answer;
    }
}
