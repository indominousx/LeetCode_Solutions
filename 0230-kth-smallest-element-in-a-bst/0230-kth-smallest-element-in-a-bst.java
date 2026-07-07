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
    public int ans=0;
    public int cnt=0;
    public void findkth(TreeNode root , int k ){
       if(root==null || cnt >=k) return;
       findkth(root.left,k);
       cnt+=1;
       if(cnt==k){ 
        ans=root.val;
        return;
        }
       findkth(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        findkth(root,k);
        return ans;
    }
}