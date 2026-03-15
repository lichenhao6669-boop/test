package erchashu;

//二叉树的层序遍历
//https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
//二叉树

import java.util.ArrayList;
import java.util.List;

/**给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。

示例 1：

输入：root = [3,9,20,null,null,15,7]
输出：[[3],[9,20],[15,7]]
示例 2：

输入：root = [1]
输出：[[1]]
示例 3：

输入：root = []
输出：[]*/

public class T24 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        level(root,res,0);
        return res;
    }
    public void level(TreeNode root,List<List<Integer>> res,int level){
       if (root == null){
           return;
       }
       if (level >= res.size()){
           res.add(new ArrayList<>());
       }
       res.get(level).add(root.val);
       level(root.left,res,level+1);
       level(root.right,res,level+1);
    }
}
