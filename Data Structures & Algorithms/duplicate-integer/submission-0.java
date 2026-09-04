class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> duplicateArray = new ArrayList<>();
        boolean duplicateFound = false;
        for(int i=0;i<nums.length;i++)
        {
            if(duplicateFound == false)
            {
                if(duplicateArray.contains(nums[i]))
                {
                    duplicateFound = true;
                    return duplicateFound;
                }
                else
                {
                    duplicateArray.add(nums[i]);
                }
            }
        }
        return duplicateFound;
    }
}