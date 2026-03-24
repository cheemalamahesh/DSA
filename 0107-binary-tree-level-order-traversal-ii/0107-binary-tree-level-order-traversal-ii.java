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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null) return l1;
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> l2 =new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            l2=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode cur=q.poll();
                l2.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            l1.add(l2);
        }
        Collections.reverse(l1);
        return l1;
    }
}