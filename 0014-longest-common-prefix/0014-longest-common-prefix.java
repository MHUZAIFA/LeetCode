class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        StringBuilder result = new StringBuilder();
        String refString = strs[0];

        int i,j;
        boolean isFinalBreak = false;

        for (i = 0; i < refString.length(); i++) {
            char currentChar = refString.charAt(i);
            for (j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1) {
                    isFinalBreak = true;
                    break;
                };

                char charToCompare = strs[j].charAt(i);
                if (currentChar != charToCompare) {
                    isFinalBreak = true;
                    break;
                }
            }
            if (isFinalBreak) break;
            result.append(currentChar);
        }

        return result.toString();
    }
}