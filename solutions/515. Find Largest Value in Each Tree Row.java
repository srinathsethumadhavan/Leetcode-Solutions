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
    public List<Integer> largestValues(TreeNode root) {
     List<Integer> list = new ArrayList<>();
        if(root==null)
            return list; 
        Queue<TreeNode> queue = new LinkedList<>();
     
        int max;
        queue.add(root);
        while(queue.isEmpty()!=true){
            int count = queue.size();
             max = Integer.MIN_VALUE;
            for(int i=0;i<count;i++)
            {
                TreeNode current = queue.poll();
                max = Math.max(current.val,max);
                if(current.left!=null)
                    queue.add(current.left);
                if(current.right!=null)
                    queue.add(current.right);
                 
            }
            list.add(max);
        }
        return list;
    }
}
