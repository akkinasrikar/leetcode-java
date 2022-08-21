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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> values = new ArrayList<>();
        if(root==null) return values;
        boolean bool = true;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            int size = que.size();
            List<Integer> vals = new ArrayList<Integer>(Collections.nCopies(size, 0));
            if(bool)
            {
                for(int i=0;i<size;i++)
                {
                    TreeNode cur = que.poll();
                    vals.set(i,cur.val);
                    if(cur.left!=null) que.offer(cur.left);
                    if(cur.right!=null) que.offer(cur.right);
                }
                bool=false;
            }
            else
            {
                
                for(int i=size-1;i>=0;i--)
                {
                    TreeNode cur = que.poll();;
                    vals.set(i,cur.val);
                    if(cur.left!=null) que.offer(cur.left);
                    if(cur.right!=null) que.offer(cur.right);
                }
                bool=true;
            }
            
            values.add(vals);
        }
        return values;   
    }
}