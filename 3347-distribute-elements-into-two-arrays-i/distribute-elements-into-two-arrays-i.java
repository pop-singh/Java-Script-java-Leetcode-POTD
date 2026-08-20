class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] res = new int[n];

        int p1 = 0;
        int p2 = 0;

        // First element -> arr1
        arr1[p1++] = nums[0];

        // Second element -> arr2
        arr2[p2++] = nums[1];

        for (int i = 2; i < n; i++) {

            if (arr1[p1 - 1] > arr2[p2 - 1]) {
                arr1[p1++] = nums[i];
            } else {
                arr2[p2++] = nums[i];
            }
        }

        // Copy arr1 into result
        int index = 0;

        for (int i = 0; i < p1; i++) {
            res[index++] = arr1[i];
        }

        // Copy arr2 into result
        for (int i = 0; i < p2; i++) {
            res[index++] = arr2[i];
        }

        return res;
    }
}