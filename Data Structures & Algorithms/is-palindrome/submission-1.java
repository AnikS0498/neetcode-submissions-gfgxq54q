class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int len = s.length();
        int i = 0;
        int j = len - 1;

        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (!Character.isLetterOrDigit(ch1)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(ch2)) {
                j--;
                continue;
            }

            if (ch1 != ch2) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
