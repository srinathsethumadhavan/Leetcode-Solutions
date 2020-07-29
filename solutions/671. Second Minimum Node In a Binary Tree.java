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
    List<Integer> list = new ArrayList<>();
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null )
            return -1;
        inOrder(root);
        if(list.size()==1)
            return -1;
        Collections.sort(list);
       
        
        return list.get(1);
        
    }
    public void inOrder(TreeNode root){
        if(root!=null)
        {
            inOrder(root.left);
            if(!list.contains(root.val))
                list.add(root.val);
            
            inOrder(root.right);
            }
        }
    
}
​
/*
we can do any tevaersal in this problem
*/
