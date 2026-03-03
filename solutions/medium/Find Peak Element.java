// Title: Find Peak Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-peak-element/

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = (right + left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;  
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }
}
