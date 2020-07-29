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
    public String smallestFromLeaf(TreeNode root) {
    
       List<StringBuffer> list = new ArrayList<>();
        findPaths(root,list,new StringBuffer());
        Collections.sort(list);       
        return list.get(0).toString();
    }
    public void findPaths(TreeNode root, List<StringBuffer> list,StringBuffer sb){
        if(root==null)
            return ;
        sb.append((char)(root.val+'a')+"");
        if(root.left==null && root.right==null)
            list.add(sb.reverse());
        findPaths(root.left,list,new StringBuffer(sb));
         findPaths(root.right,list,new StringBuffer(sb));
        }    
}
