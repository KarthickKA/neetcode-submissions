class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> duplicateArray = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(duplicateArray.contains(nums[i]))
            {
                return true;
            }
            else
            {
                duplicateArray.add(nums[i]);
            }
        }
        return false;
    }
}