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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrderUtil(root,list);
        return list;
    }
    
   public static void preOrderUtil(TreeNode root,ArrayList<Integer> list){
       if(root!=null){
           list.add(root.val);
           preOrderUtil(root.left,list);
           preOrderUtil(root.right,list);
       }
   }
}