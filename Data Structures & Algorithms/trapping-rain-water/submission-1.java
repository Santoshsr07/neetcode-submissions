class Solution {
    public int trap(int[] height) {
        int storedwater = 0;
        int left = 0;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;

        while (left < right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);

            if (leftmax < rightmax)
                storedwater += Math.min(leftmax, rightmax) - height[left++];
            else
                storedwater += Math.min(leftmax, rightmax) - height[right--];
        }

        return storedwater;
    }
}
