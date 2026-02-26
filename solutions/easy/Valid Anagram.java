// Title: Valid Anagram
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-anagram/

            return false;
        }
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        int i=0;
        while(i<ss.length){
            if(ss[i]!=tt[i])
                return false;
            i++;
        }
        return true;
    }
