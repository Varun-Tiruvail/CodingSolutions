class Solution {
    public int majorityElement(int[] nums) {
        int majorityIndex = 0;
        int count = 1;
        int i=1;
        while (i < nums.length){
            count += nums[i] == nums[majorityIndex] ? 1 : -1;
            if (count == 0){
                majorityIndex = ++i;
                count++;
            }
            i++;
        }
        return nums[majorityIndex];
    }
}