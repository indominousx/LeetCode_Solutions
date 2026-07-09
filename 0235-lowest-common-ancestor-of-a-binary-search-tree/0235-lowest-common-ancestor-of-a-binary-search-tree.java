/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // First intersection point from the bottom
        // The moment p and q splits it's the answer 
        // i.e the LCA
        if(root==null) return null;
        int curr = root.val;
        if(p.val<curr && q.val<curr) return lowestCommonAncestor(root.left , p , q);
        if(p.val>curr && q.val>curr) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}