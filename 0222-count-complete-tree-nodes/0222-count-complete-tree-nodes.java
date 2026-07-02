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
        // int cnt=0;
        // List<Integer> arr = new ArrayList<>();
        // findNodes(root,cnt,arr);
        // return arr.size();
        if(root==null) return 0;
        int l= getlh(root);
        int r = getrh(root);
        if(l==r) return ((1<<l)-1);
        else return countNodes(root.left) + countNodes(root.right)+1;
    }
    public int getlh(TreeNode root){
        int cnt=0;
        while(root!=null){
            cnt+=1;
            root=root.left;
        }
        return cnt;
    }
    public int getrh(TreeNode root){
       int cnt=0;
       while(root!=null){
        cnt+=1;
        root=root.right;
       }
       return cnt;
    } 
    //    public void findNodes(TreeNode root , int cnt , List<Integer> arr){
    //      if(root==null) return;
    //      arr.add(root.val);
    //      findNodes(root.left,cnt,arr);
    //      findNodes(root.right,cnt,arr);
    //    }
    
}