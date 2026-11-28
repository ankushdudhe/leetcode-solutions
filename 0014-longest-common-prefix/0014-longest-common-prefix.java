class Solution {
    public String longestCommonPrefix(String[] strs) {
        String check = strs[0];
        StringBuilder s = new StringBuilder();
        for(int i = 0;i < check.length();i++){
            char val = check.charAt(i);
            for(int j = 1;j < strs.length;j++){
                if (i == strs[j].length() || strs[j].charAt(i) != val) {
                    return s.toString();
                }
            }
            s.append(val);
        }
        return s.toString();
    }
}