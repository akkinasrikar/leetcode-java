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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> nums = new ArrayList<>();
        order(root,nums);
        return nums;
    }
    public void order(TreeNode node,List<Integer> nums)
    {
        if(node==null) { return; }
        order(node.left,nums);
        order(node.right,nums);
        nums.add(node.val);
    }
}