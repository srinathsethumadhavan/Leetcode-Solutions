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
    public List<Integer> inorderTraversal(TreeNode root) {
        
       ArrayList<Integer> res = new ArrayList<Integer>(0); 
       inorderUtil (root, res);
       return res;
    }
        void inorderUtil (TreeNode root, ArrayList<Integer> res)
    {
        
       if(root != null){
        inorderUtil(root.left, res);
        res.add (root.val);
        inorderUtil(root.right, res);
    }
        }
       
}