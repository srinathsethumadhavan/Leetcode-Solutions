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
    List<List<Integer>> paths = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
         findPaths(root,new ArrayList<>(),sum);
        return paths;
    }
    
    public void findPaths(TreeNode root,List<Integer> current,int sum){
        if(root==null)
            return ;
        current.add(root.val);
        if(root.left==null && root.right==null && sum-root.val==0)
        {
            paths.add(current);
            return;
        }
        
        findPaths(root.left,new ArrayList<>(current),sum-root.val);
        findPaths(root.right,new ArrayList<>(current),sum-root.val);
    }
}
