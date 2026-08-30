class Solution {
    public int trap(int[] heights) {
        int maxleft = heights[0];
        int[] arr1 = new int[heights.length];
        arr1[0] = heights[0];

        for (int i = 1; i < heights.length; i++) {
            maxleft = Math.max(maxleft, heights[i]);

            arr1[i] = maxleft;
        }
        int[] arr2 = new int[heights.length];
        arr2[heights.length - 1] = heights[heights.length - 1];
        int maxright = heights[heights.length - 1];

        for (int i = heights.length - 2; i >= 0; i--) {
            maxright = Math.max(maxright, heights[i]);
            arr2[i] = maxright;
        }
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum = sum + Math.min(arr1[i], arr2[i]) - heights[i];
        }
        return sum;

    }
}