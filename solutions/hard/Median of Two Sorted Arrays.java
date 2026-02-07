// Title: Median of Two Sorted Arrays
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

                while(i<n1) new_arr[k++]=nums1[i++];
            }
                break;

            if(nums1[i] <nums2[j]){
                new_arr[k++]=nums1[i++];
            }
            else{
                new_arr[k++]=nums2[j++];
            }
        }
        if(n%2==0) return (float)(new_arr[n/2-1]+new_arr[n/2])/2;
        else return new_arr[n/2];
    }
}
