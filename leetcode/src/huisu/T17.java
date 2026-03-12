package huisu;

//全排列
//https://leetcode-cn.com/problems/permutations/
//回溯

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。



示例 1：

输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
示例 2：

输入：nums = [0,1]
输出：[[0,1],[1,0]]
示例 3：

输入：nums = [1]
输出：[[1]]*/

public class T17 {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> path = new ArrayList<>();
        for (int num : nums) {
            path.add(num);
        }
        int n = nums.length;
        backtrack(n,res, path,0);
        return res;
    }
    private void backtrack(int n, List<List<Integer>> res, List<Integer> path, int index) {
        if (index == n) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < n; i++) {
            //做选择
            Collections.swap(path, index, i);
            //递归
            backtrack(n, res, path, index + 1);
            //撤销选择
            Collections.swap(path, index, i);
        }
    }
}

