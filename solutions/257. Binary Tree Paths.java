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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> list = new ArrayList<>();
        findPaths(root,list,new String());
        return list;
    }
    public void findPaths(TreeNode root, List<String> list,String s){
        if(root==null)
            return ;
        s+=root.val;
        if(!(root.left==null) || !(root.right==null))
            s+="->";
        if(root.left==null && root.right==null)
            list.add(s);
        findPaths(root.left,list,new String(s));
         findPaths(root.right,list,new String(s));
        }
    
}
