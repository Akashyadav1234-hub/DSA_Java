// Title: Sort Characters By Frequency
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-characters-by-frequency/

        );
        
        pq.addAll(hm.entrySet());
        
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue
()));
        }
        
        return result.toString();
    }
}


