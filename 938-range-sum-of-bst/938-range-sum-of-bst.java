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
    public int rangeSumBST(TreeNode root, int low, int high)
    {
        return find(root,low,high);
    }
    public int find(TreeNode node,int l,int h)
    {
        if (node==null) { return 0; }
        if (node.val<=h && node.val>=l)
        {
            return node.val+find(node.left,l,h)+find(node.right,l,h);
        }
        else
        {
            return find(node.left,l,h)+find(node.right,l,h);
        }
    }
}