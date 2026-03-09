package dongtaiguihua;

//爬楼梯
//https://leetcode-cn.com/problems/climbing-stairs/
//动态规划

import java.util.Scanner;

/**假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

示例 1：
输入：n = 2
输出：2
解释：有两种方法可以爬到楼顶。
        1. 1 阶 + 1 阶
2. 2 阶

示例 2：
输入：n = 3
输出：3
解释：有三种方法可以爬到楼顶。
        1. 1 阶 + 1 阶 + 1 阶
2. 1 阶 + 2 阶
3. 2 阶 + 1 阶*/

//f(x)=f(x-1)+f(x-2)
public class T10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
       return climbStairs2(n);
    }
    public static int climbStairs2(int n) {
       if(n==1){
           return 1;
       }else if(n==2){
           return 2;
       }else{
           return climbStairs2(n-1)+climbStairs2(n-2);
       }
    }
}
