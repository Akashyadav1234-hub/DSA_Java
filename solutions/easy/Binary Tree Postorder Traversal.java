// Title: Binary Tree Postorder Traversal
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-postorder-traversal/

 */
class Solution {
    List<Integer> l1 = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return l1;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l1.add(root.val);
        
        return l1;

    }
}
