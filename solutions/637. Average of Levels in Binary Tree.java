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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        long sum =0;
        int count=0;
        while(q.isEmpty()==false)
        {
             count = q.size();
            sum=0;
            for(int i = 0;i<count;i++){
                TreeNode p = q.poll();
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
                sum+=p.val;
          }
            list.add((double)sum/(double)count);
        }
        return list;

    }
}