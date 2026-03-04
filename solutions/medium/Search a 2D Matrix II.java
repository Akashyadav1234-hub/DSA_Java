// Title: Search a 2D Matrix II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

        int r=0;
        while(r<row && col>=0){
            if(target>matrix[r][col]){
                r++;
            }else{
                if(target<matrix[r][col]){
                    col--;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
