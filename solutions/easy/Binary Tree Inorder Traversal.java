// Title: Binary Tree Inorder Traversal
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }
}
