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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer,TreeNode> par = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
         int size=q.size();
         for(int i=0;i<size;i++){
            TreeNode top = q.poll();
            if(top.left!=null){
                par.put(top.left.val,top);
                q.add(top.left);
            }
            if(top.right!=null){
                par.put(top.right.val,top);
                q.add(top.right);
            }
         }
        }

        Map<Integer,Integer> vis = new HashMap<>();
        q.add(target);
        while(k>0 && !q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode top=q.poll();
                vis.put(top.val,1);
                if(top.left!=null && !vis.containsKey(top.left.val)) q.add(top.left);
                if(top.right!=null && !vis.containsKey(top.right.val)) q.add(top.right);
                if(par.containsKey(top.val) && !vis.containsKey(par.get(top.val).val)){
                    q.add(par.get(top.val));
                }
            }
            k-=1;
        }
        while(!q.isEmpty()) arr.add(q.poll().val);
        return arr;
    }
}