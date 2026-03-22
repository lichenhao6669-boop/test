package erchashu;

//二叉树展开为链表
//https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/
//二叉树

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
给你二叉树的根结点 root ，请你将它展开为一个单链表：

展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
展开后的单链表应该与二叉树 先序遍历 顺序相同。

示例 1：

输入：root = [1,2,5,3,4,null,6]
输出：[1,null,2,null,3,null,4,null,5,null,6]
示例 2：

输入：root = []
输出：[]
示例 3：

输入：root = [0]
输出：[0]
*/
public class T29 {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
       if (root == null){
           return;
       }
       first(root,list);
       for (int i = 1; i < list.size(); i++) {
           TreeNode pre = list.get(i-1);
           TreeNode cur = list.get(i);
           pre.left = null;
           pre.right = cur;
       }
    }
    public void first(TreeNode root, List list){
        if (root == null){
            return;
        }
        list.add(root);
        first(root.left,list);
        first(root.right,list);
    }
}
