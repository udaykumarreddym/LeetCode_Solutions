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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root,0,ans);
        return ans;
    }
    public static void bfs(TreeNode node,int level,List<List<Integer>> ans){
        if(node == null) return;
        if(level == ans.size()) ans.add(new ArrayList<>());
        ans.get(level).add(node.val);
        bfs(node.left,level+1,ans);
        bfs(node.right,level+1,ans);
    }
}