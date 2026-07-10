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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        formArr(root , arr);
        int l=0;
        int r=arr.size()-1;
        while(l<r){
            int currsum=arr.get(l)+arr.get(r);
         if(currsum==k){return true;} 
         else if(currsum>k) {
            r-=1;
            }
         else {
            l+=1;
            }
        }
        return false;
    }
    public void formArr(TreeNode root , ArrayList<Integer> arr){
        if(root==null) return;
        formArr(root.left,arr);
        arr.add(root.val);
        formArr(root.right,arr);
    }
}