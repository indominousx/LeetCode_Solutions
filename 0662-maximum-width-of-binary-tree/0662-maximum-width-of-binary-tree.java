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
  class levandId{
    TreeNode node;
    int val;
    levandId(TreeNode node , int val){
        this.node=node;
        this.val=val;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<levandId> q = new LinkedList<>();
        int ans=0;
        q.add(new levandId(root,0));
        while(!q.isEmpty()){
            int s=q.size();
            int mmin=q.peek().val;
            int f=0;
            int l=0;
            for(int i=0;i<s;i++){
                int curid=q.peek().val-mmin;
                TreeNode n = q.peek().node;
                q.poll();
                if(i==0) f=curid;
                if(i==s-1) l=curid;
                if(n.left!=null) q.add(new levandId(n.left,curid*2+1));
                if(n.right!=null) q.add(new levandId(n.right,curid*2+2));
            }
             ans=Math.max(ans,l-f+1);
        }
        return ans;
    }
}