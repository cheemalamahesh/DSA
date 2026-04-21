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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        if(root==null) return l;
        in(root,l);
        return l;
        
    }
    private void in(TreeNode root,ArrayList<Integer> l){
        if(root == null ) return ;
        in(root.left,l);
        l.add(root.val);
        in(root.right,l);
    }
}