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
    List<Integer> list =  new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        
        inorder(root);
        TreeNode dummyRoot = new TreeNode(list.get(0));
        TreeNode newRoot=dummyRoot;
        for(int i=1;i<list.size();i++)
        {
            TreeNode temp = new TreeNode(list.get(i));
            dummyRoot.right=temp;
            dummyRoot=temp;
            
        }
            
        return newRoot;
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
}
