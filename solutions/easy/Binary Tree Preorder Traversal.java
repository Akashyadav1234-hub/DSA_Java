// Title: Binary Tree Preorder Traversal
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-preorder-traversal/

            res.add(curr.val);

            //push right
            TreeNode curr = st.pop();

        while (!st.isEmpty()){  //print  left  right   - print  right left 
            //pop current and add to ans
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //iterative

