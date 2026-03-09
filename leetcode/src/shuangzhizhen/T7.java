package shuangzhizhen;

//盛最多水的容器
//https://leetcode.cn/problems/container-with-most-water/
//双指针

/**给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
返回容器可以储存的最大水量。*/
public class T7 {
    public int maxArea(int[] height) {
         int max=0;
         if (height.length==2){
             return Math.min(height[0],height[1]);
         }
         int i=0;
         int j=height.length-1;
         while (i<j){
             max = Math.max(Math.min(height[i],height[j])*(j-i),max);
             if (height[i]<height[j]){
                 i++;
             }
             else {
                 j--;
             }
         }
         return max;
    }
}
