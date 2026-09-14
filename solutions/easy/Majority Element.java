// Title: Majority Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/majority-element/

            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
    }
        return candidate;
}
