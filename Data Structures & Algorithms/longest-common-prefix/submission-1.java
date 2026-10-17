class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";
        int idx = 0;

        while (idx < strs[0].length()) {
            char ch = strs[0].charAt(idx);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() <= idx ||
                    strs[j].charAt(idx) != ch) {
                    return lcp;
                }
            }

            idx++;
            lcp += ch;
        }

        return lcp;
    }
}