class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length - 1;
        int count = 0;
        if(n+1 == 1){
            return 1;
        }
        if(nums[0] >= nums[1]){
            count++;
        }
        if(nums[n] >= nums[n - 1]){
            count++;
        }
        for(int i = 1;i < n;i++){
            if(nums[i] >= (nums[i - 1] + nums[i + 1])/2.0){
                count++;
            }
        }
        return count;
    }
}