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
    public int countNodes(TreeNode root) {
        int cnt=0;
        List<Integer> arr = new ArrayList<>();
        findNodes(root,cnt,arr);
        return arr.size();
    }
       public void findNodes(TreeNode root , int cnt , List<Integer> arr){
         if(root==null) return;
         arr.add(root.val);
         findNodes(root.left,cnt,arr);
         findNodes(root.right,cnt,arr);
       }
}