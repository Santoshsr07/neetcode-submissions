class Solution {
    public int[] replaceElements(int[] arr) {
        int[] surfix = new int[arr.length];
        surfix[arr.length - 1] = -1;
        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            max = Math.max(max, arr[i+1]);
            surfix[i] = max;
        }

        return surfix;
    }
}