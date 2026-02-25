// Title: Rotate String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-string/

        return false;
    }
    
    private boolean rotateString(String A, String B, int rotation) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
                return false;
            }
        }
        return true;
    }
}
