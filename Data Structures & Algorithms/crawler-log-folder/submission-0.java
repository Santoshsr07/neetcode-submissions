class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stk = new Stack<>();

        for (String str : logs) {
            if (str.equals("../")) {
                if (!stk.isEmpty())
                    stk.pop();
            } else if (!str.equals("./"))
                stk.push(str);
        }

        return stk.size();
    }
}