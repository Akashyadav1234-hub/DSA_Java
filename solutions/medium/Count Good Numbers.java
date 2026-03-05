// Title: Count Good Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-good-numbers/

    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long a = power(5, even);
        long b = power(4, odd);

        return (int)((a * b) % mod);
    }
}
