/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // Recursively check the depth of the tree
    public int maxDepth(TreeNode root) {
        // If the root is null return 0
        if(root == null) return 0;
        // Else take the max of either the left subtree + 1 and right subtree + 1
        // and return it
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}