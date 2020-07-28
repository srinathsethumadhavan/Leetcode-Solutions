/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
         findPaths(root,paths,new ArrayList<>(),sum);
        return paths;
    }
    
    public void findPaths(TreeNode root,List<List<Integer>> paths,List<Integer> current,int sum){
        if(root==null)
            return ;
        current.add(root.val);
        if(root.left==null && root.right==null && sum-root.val==0)
        {
            paths.add(current);
            return;
        }
        
        findPaths(root.left,paths,new ArrayList<>(current),sum-root.val);
        findPaths(root.right,paths,new ArrayList<>(current),sum-root.val);
    }
}
