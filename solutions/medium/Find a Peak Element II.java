// Title: Find a Peak Element II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-a-peak-element-ii/

            int left = (mid-1>=0) ? mat[maxrow][mid-1] :-1;
            int right = (mid+1<m) ? mat[maxrow][mid+1] :-1;
            if(mat[maxrow][mid]>left && mat[maxrow][mid]>right){
                return new int[]{maxrow,mid};
            }
            else if(left>mat[maxrow][mid]){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
