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
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        
       TreeNode t =  cTree(preOrder,inOrder,0,inOrder.length-1);
        return t;
    }
     int PreOrderIndex=0;
    
    
    public  TreeNode cTree(int[] preOrder,int[] inOrder,int inOrderStart,int inOrderEnd){
     
        if( inOrderStart>inOrderEnd)
           return null;
         TreeNode root = new TreeNode(preOrder[PreOrderIndex++]);
        
        int inOrderIndex=-1;
        for(int i = inOrderStart;i<=inOrderEnd;i++){
            if(inOrder[i]==root.val){
                inOrderIndex =i;
                break;
            }
        }
        root.left=  cTree(preOrder,inOrder,inOrderStart,inOrderIndex-1);
        root.right=  cTree(preOrder,inOrder,inOrderIndex+1,inOrderEnd);
        return root;
        
    }
    
}