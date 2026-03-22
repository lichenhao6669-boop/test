package erchashu;

// 二叉树的右视图
// https://leetcode.cn/problems/binary-tree-right-side-view/
// 二叉树

import java.util.ArrayList;
import java.util.List;

/**给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。

示例 1：
输入：root = [1,2,3,null,5,null,4]
输出：[1,3,4]
解释：
示例 2：
输入：root = [1,2,3,4,null,null,null,5]
输出：[1,3,4,5]
解释：
示例 3：
输入：root = [1,null,3]
输出：[1,3]
示例 4：
输入：root = []
输出：[]*/
public class T28 {
    // 主入口
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 从根节点开始，深度为 0
        dfs(root, 0, result);
        return result;
    }

    /**
     * 深度优先搜索
     * @param node 当前节点
     * @param depth 当前深度
     * @param result 结果列表
     */
    private void dfs(TreeNode node, int depth, List<Integer> result) {
        if (node == null) {
            return;
        }

        // 核心逻辑：如果当前深度等于结果列表大小，说明是该层第一个被访问的节点（因为先遍历右边）
        if (depth == result.size()) {
            result.add(node.val);
        }

        // 优先遍历右子树，确保每层最先遇到的是最右边的节点
        dfs(node.right, depth + 1, result);
        // 其次遍历左子树
        dfs(node.left, depth + 1, result);
    }
}
