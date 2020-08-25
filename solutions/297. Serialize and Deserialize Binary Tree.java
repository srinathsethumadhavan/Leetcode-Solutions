/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
​
    
    public String serialize(TreeNode root) {
        if(root==null)
            return "*";
        String result = "";
        result+=root.val;
        result+=","+serialize(root.left);
        result+=","+serialize(root.right);
        return result;
    }
​
   
    public TreeNode deserialize(String data) {
        int[] i = new int[1];
       return  helper(data.split(","),i);
    }
    
    public TreeNode helper(String[] arr,int[] i){
        if(arr.length==i[0])
            return null;
        String val = arr[i[0]++];
        if(val.equals("*"))
          return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = helper(arr,i);
        root.right= helper(arr,i);
        return root;
    }
}
​
​
