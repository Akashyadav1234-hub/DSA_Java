// Title: Longest Palindromic Substring
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-palindromic-substring/


        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
