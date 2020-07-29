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
    public int countNodes(TreeNode root) {
       
        int hLeft=0;
        int hRight=0;
        TreeNode pLeft=root;
        TreeNode pRight=root;
        while(pLeft!=null){
            hLeft++;
            pLeft=pLeft.left;
            }
        while(pRight!=null){
            hRight++;
            pRight=pRight.right;
            
        }
        if(hLeft==hRight){
            return (int)Math.pow(2,hLeft)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
​
​
/*
if(root==null)
return 0;
return countNodes(root.left)+countNodes(root.right)+1;
*/
