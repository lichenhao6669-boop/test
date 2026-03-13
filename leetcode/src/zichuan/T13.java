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
        // 判断数组是否为空或长度为0，如果是则直接返回0
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // map 用于存储：前缀和 -> 该前缀和出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        // 初始化，前缀和为 0 出现 1 次（处理从索引 0 开始的子数组）
        map.put(0, 1);
        // count 用于记录满足条件的子数组个数
        int count = 0;
        // currentSum 用于记录当前的累加和（前缀和）
        int currentSum = 0;
        // 遍历数组中的每一个元素
        for (int num : nums) {
            // 更新当前前缀和
            currentSum += num;
            // 如果 (currentSum - k) 在 map 中存在，说明找到了满足条件的子数组
            // 将对应的前缀和出现次数累加到 count 中
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            // 将当前前缀和存入 map，次数 +1
            // 如果 map 中已存在该前缀和，则在其原有次数基础上加 1
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        // 返回满足条件的子数组总个数
        return count;
    }
}
