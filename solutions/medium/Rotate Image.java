// Title: Rotate Image
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-image/

        for(int i=0;i<matrix.length;i++){
        }
            s++;e--;
            matrix[e]=temp;
            matrix[s]=matrix[e];
            int [] temp=matrix[s];
            for(int j=i+1;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
