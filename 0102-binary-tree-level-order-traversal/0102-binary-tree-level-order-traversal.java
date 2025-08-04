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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        bfs(root,0,ans);
        return ans;
    }
    public void bfs(TreeNode node,int level,List<List<Integer>> list){
        if(node == null){
            return;
        }
        if(level == list.size()){
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        bfs(node.left,level+1,list);
        bfs(node.right,level+1,list);
    }
}