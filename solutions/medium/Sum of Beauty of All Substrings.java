// Title: Sum of Beauty of All Substrings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

                freq[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}
