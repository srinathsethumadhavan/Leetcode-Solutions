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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0 || nums==null)
          return null;
       return  helper(nums,0,nums.length-1);
    }
    private TreeNode helper(int [] arr,int start,int end){
        if(end<start)
            return null;
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr,start,mid-1);
        root.right= helper(arr,mid+1,end);
        return root;
    }
}
