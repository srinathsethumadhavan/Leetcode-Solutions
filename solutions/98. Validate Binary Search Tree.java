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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        return validateBST(root,null,null);
    }
    public boolean validateBST(TreeNode root, Integer min,Integer max){
        if(root==null)
            return true;
        if((max!=null && root.val>=max) || (min!=null && root.val<=min))
            return false;
        return validateBST(root.left,min,root.val) && validateBST(root.right,root.val,max);
    }
}