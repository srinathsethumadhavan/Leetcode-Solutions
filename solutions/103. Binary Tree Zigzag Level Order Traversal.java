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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       if(root==null)
           return new ArrayList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(s1.isEmpty()!=true || s2.isEmpty()!=true)
          {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            while(s1.isEmpty()!=true)
            {
                TreeNode current = s1.pop();
                list1.add(current.val);
                if(current.left!=null)
                    s2.push(current.left);
                if(current.right!=null)
                    s2.push(current.right);
            }
            mainList.add(list1);
            while(s2.isEmpty()!=true)
            {
                TreeNode current = s2.pop();
                list2.add(current.val);
                if(current.right!=null)
                    s1.push(current.right);
                 if(current.left!=null)
                    s1.push(current.left);
            }
              mainList.add(list2);
            
        }
        if(mainList.get(mainList.size()-1).size()==0)
        mainList.remove(mainList.size()-1);
        return mainList;
    }
}
​
