// Title: Longest Palindromic Substring
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-palindromic-substring/

        while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
    private int expandFromCenter(String str,int left,int right){
            left--;
            right++;
        }
        return right-left-1;
    }
}
class mein{
    public static void main(String[] args){
        Solution sol=new Solution();
        String input="babad";
        System.out.println("Longest:"+sol.longestPalindrome(input));
    }
}
