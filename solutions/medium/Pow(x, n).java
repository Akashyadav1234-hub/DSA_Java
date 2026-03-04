// Title: Pow(x, n)
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/pow(x,-n)/

        }

        double result = 1;
        double current_product = x;

            if (n % 2 == 1)
        while (n > 0) {
                result = result * current_product;
            current_product = current_product * current_product;
            n = n / 2;
        }

        return result;
    }
}
