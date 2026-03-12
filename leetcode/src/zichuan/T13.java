package zichuan;

//和为 K 的子数组
//https://leetcode.cn/problems/subarray-sum-equals-k/
//子串

import java.util.HashMap;
import java.util.Map;

/**给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
子数组是数组中元素的连续非空序列。

示例 1：

输入：nums = [1,1,1], k = 2
输出：2
示例 2：

输入：nums = [1,2,3], k = 3
输出：2*/

public class T13 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // map 用于存储：前缀和 -> 该前缀和出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        // 初始化，前缀和为 0 出现 1 次（处理从索引 0 开始的子数组）
        map.put(0, 1);
        int count = 0;
        int currentSum = 0;
        for (int num : nums) {
            // 更新当前前缀和
            currentSum += num;
            // 如果 (currentSum - k) 在 map 中存在，说明找到了满足条件的子数组
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            // 将当前前缀和存入 map，次数 +1
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
