package problems.medium;

public class P11_ContainWithMostWater {
    public int maxArea(int[] height) {

        if (height == null || height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            maxArea = Math.max(maxArea, calculateArea(height, start, end));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }

        }

        return maxArea;
    }

    private int calculateArea(int[] height, int start, int end) {
        return (end - start) * Math.min(height[start], height[end]);
    }
}
