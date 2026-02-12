// Title: Majority Element II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/majority-element-ii/

            else if(num==num2){
                count2++;
            }
        }
            int n=arr.length;
        
        if(count1>n/3)
            answer.add(num1);
        
        if(count2>n/3)
            answer.add(num2);
        
        return answer;
