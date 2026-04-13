class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

    if(nums.length==0)
    return 0;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==target)
        { 
            min=Math.min((int)Math.abs(i-start),min);
        }
    }
    return min;
        
    }
}