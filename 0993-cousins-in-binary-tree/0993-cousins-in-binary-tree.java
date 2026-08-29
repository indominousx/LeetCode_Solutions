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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean xf=false;
            boolean yf=false;
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                if(cur.left!=null && cur.right!=null){
                    if((cur.left.val==x && cur.right.val==y) || 
                        (cur.left.val==y && cur.right.val==x)){
                            return false;
                        }
                      }
                      if(cur.val==x) xf=true;
                      if(cur.val==y) yf=true;
                      if(cur.left!=null) q.add(cur.left);
                      if(cur.right!=null) q.add(cur.right);
            }
            if(xf && yf) return true;
            if(xf || yf) return false;

        }
        return false;
    }
}