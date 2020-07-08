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
    public int diameterOfBinaryTree(TreeNode root) {
       
        
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        // int diamaterThroughRoot = ;
         int leftDiameter =  diameterOfBinaryTree(root.left);
         int rightDiameter =  diameterOfBinaryTree(root.right);
        // int diamaterNotThroughRoot= Math.max(leftDiameter,rightDiameter);
        int res = Math.max(left+right,Math.max(leftDiameter,rightDiameter));
        return res;
    }
    
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int left = height(root.left);
       int right = height(root.right);

        return 1+Math.max(left,right);
    }
}