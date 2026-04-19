class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=nums1.length-1,j=nums2.length-1;
        int max=Integer.MIN_VALUE;
        while(i>=0 &&j>=0)
        {
            if(nums1[i]<=nums2[j])
            {  
                max=Math.max(max,(j-i));
                i--;
            }
            else{
                j--;
            }


        }
        return max<0?0:max;
        
    }
}