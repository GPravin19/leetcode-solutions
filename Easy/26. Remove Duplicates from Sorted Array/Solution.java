class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueNum = 0;
        if (nums.length == 1) {
            return 1;
        }
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[uniqueNum]){
                uniqueNum++;
                nums[uniqueNum] = nums[j];
            }
        }
        return uniqueNum + 1;
    }
}