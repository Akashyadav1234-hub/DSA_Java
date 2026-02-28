// Title: String to Integer (atoi)
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/string-to-integer-(atoi)/

            int digit = s.charAt(i) - '0';
            
            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }
        
        return sign * result;
    }
}
