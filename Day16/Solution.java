class Solution {
    public int triangularSum(int[] nums) {
        for(int i=nums.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                nums[j] = nums[j]+nums[j+1];
                if(nums[j]>9){
                    nums[j]%=10;
                }
            }
        }
        return nums[0];
    }
}
