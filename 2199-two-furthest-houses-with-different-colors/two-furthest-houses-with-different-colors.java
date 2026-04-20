class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;

        // compare with first element
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != colors[0]) {
                max = j;
                break;
            }
        }

        // compare with last element
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                max = Math.max(max, n - 1 - i);
                break;
            }
        }

        return max;
    }
}