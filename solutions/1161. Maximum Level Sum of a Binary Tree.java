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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int level=0;
        int maxSum = Integer.MIN_VALUE;
        q.add(root);
        int res = 0;
        while(q.isEmpty()==false)
        {
            int count = q.size();
            sum=0;
            ++level;
            for(int i=0;i<count;i++){
                TreeNode p = q.poll();
                sum+=p.val;
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
            }
            
            if(maxSum<sum){
                maxSum=sum;
                res=level;
            }
          
        }
        
        
         return res;
    }
}