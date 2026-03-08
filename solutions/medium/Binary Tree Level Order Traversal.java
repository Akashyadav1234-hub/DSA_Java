// Title: Binary Tree Level Order Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-level-order-traversal/

        while (!q.isEmpty()){
            List<Integer> row = new ArrayList<>();
            int n = q.size();
            for (int i =0; i< n ; i++){
                TreeNode front = q.poll();
                row.add(front.val);
                if (front.left != null) q.offer(front.left);
                if (front.right != null) q.offer(front.right);
        if (root == null) return ans;
        q.offer(root);
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

