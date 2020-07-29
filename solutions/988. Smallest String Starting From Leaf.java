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
    String ans ="~";
    public String smallestFromLeaf(TreeNode root) {
        
       
        findPaths(root,new StringBuffer());
               
        return ans;
    }
    public void findPaths(TreeNode root, StringBuffer sb){
        if(root==null)
            return ;
        sb.append((char)(root.val+'a')+"");
        
        if(root.left==null && root.right==null)
        {
           
            sb.reverse();
        String temp = sb.toString();
            if(temp.compareTo(ans)<0)
                ans=temp;
        }
        findPaths(root.left,new StringBuffer(sb));
         findPaths(root.right,new StringBuffer(sb));
        }    
}
