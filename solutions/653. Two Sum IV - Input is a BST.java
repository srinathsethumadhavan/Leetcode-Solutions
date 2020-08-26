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
   
    public boolean findTarget(TreeNode root, int k) {
         inOrder(root);
        int i=0;
        int j=list.size()-1;
        int sum =0;
        while(list.get(i)<list.get(j)){
            sum = list.get(i)+list.get(j);
            if(sum==k)
                return true;
            else if(sum<k)
                i++;
            else
                j--;    
        }
        return false;
     
    }
    public void inOrder(TreeNode root){
        if(root!=null)
        {
            inOrder(root.left);
            list.add(root.val);
           inOrder(root.right);
        }
    }
}
​
​
/*
Inorder traversal gives the sorted list
then we can use two pointer apporach since we have sorted list
*/
