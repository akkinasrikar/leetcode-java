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
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        List<List<Integer>> values = new ArrayList<>();
        if(root==null) return values;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            int size=que.size();
            List<Integer> val = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode cur=que.poll();
                val.add(cur.val);
                if(cur.left!=null) que.offer(cur.left);
                if(cur.right!=null) que.offer(cur.right);
            }
            values.add(val);
        }
        
        Collections.reverse(values);
        return values;
    }
}