class Solution {
    public int lengthOfLastWord(String s) {
        String newstr = s.trim();
        int res = 0;

        for (int i = newstr.length() - 1; i >= 0; i--) {
            if (newstr.charAt(i) != ' ') {
                res++;
            } else {
                break;
            }
        }

        return res;
    }
}