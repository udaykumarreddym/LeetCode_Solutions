/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = Integer.MIN_VALUE;
        height(root);
        return max;
    }
    private static int height(TreeNode node){
        if(node == null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        max = Math.max(max,l+r);
        return 1 + Math.max(l,r);
    }
}