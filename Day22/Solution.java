class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==0){
                    temp=nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
