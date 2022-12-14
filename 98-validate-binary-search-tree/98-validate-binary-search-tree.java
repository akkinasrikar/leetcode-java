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
    public boolean isValidBST(TreeNode root) 
    {
          return valid(root,Long.MAX_VALUE,Long.MIN_VALUE);  
    }
    
    public boolean valid(TreeNode node,long max,long min)
    {
        if(node==null) return true;
        if(node.val>=max || node.val<=min) return false;
        return valid(node.left,node.val,min) && valid(node.right,max,node.val);
    }
}