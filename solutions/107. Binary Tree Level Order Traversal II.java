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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
          List<List<Integer>> mainList = new  LinkedList<List<Integer>>();
        if(root==null)
            return mainList;        
      Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int count = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<count;i++)
            {
                TreeNode p = q.poll();
               list.add(p.val);      
            if(p.left!=null)
                q.add(p.left);
            if(p.right!=null)
                q.add(p.right);
            }
            mainList.add(list);
           
        }
        Collections.reverse(mainList);  
         return mainList;
    }
}