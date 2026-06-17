class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        int res = 0;
        
        for(int i=0;i<len;i++){
            // count odd length palindrome
            res += countPalindrome(i, i, s);

            res += countPalindrome(i, i+1, s);
        }

        return res;
    }

    private int countPalindrome(int l, int r, String str){
        int res = 0;
        while((l >=0 && r < str.length()) && str.charAt(l) == str.charAt(r)){
            l--; r++; res++;
        }

        return res;
    }
}
