// Title: Binary Tree Preorder Traversal
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-preorder-traversal/

 */
class Solution {
    List<Integer> l1 = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return l1;
        }
        l1.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        
        return l1;
    }
}
