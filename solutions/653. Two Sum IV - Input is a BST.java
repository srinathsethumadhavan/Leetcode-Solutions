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
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        preOrder(root);
     int target = 0;
        set.addAll(list);         
        for(int l : list)
        {
            target= k-l;  
            set.remove(l);
            if(set.contains(target))
                return true;
        }
           return false;
    }
    public void preOrder(TreeNode root){
        if(root!=null)
        {
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
