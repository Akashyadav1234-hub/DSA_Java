// Title: Spiral Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/spiral-matrix/

            for(int j=top;j<=bottom;j++)
            top++;
                spiral.add(matrix[j][right]);
            right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--)
                    spiral.add(matrix[bottom][k]);
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--)
