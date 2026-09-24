// Title: Set Matrix Zeroes
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/set-matrix-zeroes/

            for (int j = col - 1; j > 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (checker)
                matrix[i][0] = 0;
        }
    }
}
