// Title: Remove Outermost Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-outermost-parentheses/

        StringBuilder res = new StringBuilder();

        while (end < s.length()) {
            if (s.charAt(end) == '(') sum++;
            else sum--;

            if (sum == 0) {
                res.append(s.substring(start + 1, end)); // exclude outer
                start = end + 1;
            }
            end++;
        }
        return res.toString();
    }
}
