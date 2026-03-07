// Title: Letter Combinations of a Phone Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

    }

    private void backtrack(String combination, String next_digits, String[] 
phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), 
phone_map, output);
            }
        }
    }
}
