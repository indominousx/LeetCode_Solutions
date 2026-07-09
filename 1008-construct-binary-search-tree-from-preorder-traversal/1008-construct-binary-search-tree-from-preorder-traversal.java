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
    public TreeNode bstFromPreorder(int[] A) {
        // Using the Upper Bound Technique
        return formBst(A,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode formBst(int[] a , int ub , int[] i){
        if(i[0]==a.length || a[i[0]]>ub) return null;
        TreeNode root = new TreeNode(a[i[0]++]);
        root.left=formBst(a,root.val,i);
        root.right=formBst(a,ub,i);
        return root;
    }
}