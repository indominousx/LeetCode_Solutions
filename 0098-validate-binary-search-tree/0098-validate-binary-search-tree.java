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
    public boolean isValidBST(TreeNode root) {
         return validity(root,Long.MIN_VALUE,Long.MAX_VALUE);
        // return validity(root);
    }
   public boolean validity(TreeNode root, Long lval , Long rval){
      if(root==null) return true;
      if(root.val<=lval || root.val >=rval) return false;
      return validity(root.left,lval,(long)root.val) && validity(root.right,(long)root.val,rval);
   }




    // public boolean validity(TreeNode root){
    //   if(root.left!=null){
    //     if(root.left.val>=root.val) return false;
    //   }
    //   if(root.left==null) return true;
    //   if(root.right!=null){
    //     if(root.right.val<=root.val) return false;
    //   }
    //   if(root.right==null) return true;

    //   return validity(root.left) && validity(root.right);
    // does not work for [10, 5, 15, null, null, 6, 20]
    // }
}