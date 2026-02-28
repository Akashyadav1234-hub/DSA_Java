// Title: Roman to Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/roman-to-integer/

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
        int result = 0;

        );
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
            'I', 1, 'V', 5, 'X', 10,
