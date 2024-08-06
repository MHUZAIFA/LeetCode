class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        StringBuilder reverse = new StringBuilder(String.valueOf(x)).reverse();
        return str.compareTo(reverse) == 0;
    }
}