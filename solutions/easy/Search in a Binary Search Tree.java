// Title: Search in a Binary Search Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-a-binary-search-tree/

            return searchBST(root.left, val);
        }
        return null;
    }
}
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null; // check null first
        if(root.val == val) return root;
        if(val > root.val){
            return searchBST(root.right, val);
        }
        if(val < root.val){
class Solution {
