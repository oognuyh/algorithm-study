package P12977;

class Nohtaewon{
	public int solution(int[] nums) {
		int answer=0;
		for(int i=0; i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					int sum=nums[i]+nums[j]+nums[k];
					int count=0;
					for(int l=2;l<=sum;l++) {
						if(sum%l==0) {
							count++;
						}else if(count>1) {
							break;
						}
					}
					if(count==1) {
						answer++;
					}
				}
			}
		}
		return answer;		
	}
}
