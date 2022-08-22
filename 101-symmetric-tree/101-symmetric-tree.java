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
    public boolean isSymmetric(TreeNode root) 
    {
        return mirror(root,root);   
    }
    public boolean mirror(TreeNode a,TreeNode b)
    {
        if (a==null && b==null) return true;
        if (a!=null && b!=null)
        {
            if(a.val==b.val)
            {
                return mirror(a.left,b.right) && mirror(a.right,b.left);
            }
        }
        return false;
    }
}