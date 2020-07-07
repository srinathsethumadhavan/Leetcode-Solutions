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
        // base case
       if(root == null){
           return;
       }        
        // recurse for left child
        inorderUtil(root.left, res);
        res.add (root.val);
        // recurse for right child
        inorderUtil(root.right, res);
    }
       
}