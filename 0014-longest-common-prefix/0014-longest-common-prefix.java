class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numberOfWords = strs.length;

        if (numberOfWords == 1) return strs[0];

        StringBuilder result = new StringBuilder();
        String refString = strs[0];
        int refStringLength = refString.length();

        int i,j;
        boolean isFinalBreak = false;
        for (i = 0; i < refStringLength; i++) {
            char currentChar = refString.charAt(i);
            for (j = 1; j < numberOfWords; j++) {
                if (i <= strs[j].length() - 1 && currentChar == strs[j].charAt(i)) continue;
                isFinalBreak = true;
                break;
            }
            if (isFinalBreak) break;
            result.append(currentChar);
        }

        return result.toString();
    }
}