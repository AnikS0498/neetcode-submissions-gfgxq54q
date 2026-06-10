class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";

        if(len == 1)
            return s;

        for(int i=1;i<len;i++){
            int l=i, r=i;
            while(s.charAt(l) == s.charAt(r)){
                --l; ++r;

                if(l == -1 || r == len)
                    break;
            }

            String palindromeStr = s.substring(l+1, r);
            if(palindromeStr.length() > res.length()){
                res = palindromeStr;
            }

            l=i-1; r=i;
            while(s.charAt(l) == s.charAt(r)){
                --l; ++r;

                if(l == -1 || r == len)
                    break;
            }

            palindromeStr = s.substring(l+1, r);
            if(palindromeStr.length() > res.length()){
                res = palindromeStr;
            }
        }


        return res;

    }
}
