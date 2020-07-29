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
    int number=0;
    public int sumNumbers(TreeNode root) {
        sum(root,new Integer(0));
        return number; 
    }
    public void sum(TreeNode root,int temp){
        if(root==null)
            return;
       
        temp=temp*10+root.val;
        if(root.left==null &&root.right==null){
            number+=temp;
            return;
        }
        sum(root.left, new Integer(temp));
        sum(root.right,new Integer(temp));
    }
}
