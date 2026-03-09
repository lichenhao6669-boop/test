package juzhen;

// 矩阵置零
//https://leetcode.cn/problems/set-matrix-zeroes/
//矩阵

import java.util.ArrayList;
import java.util.List;

/**
给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
示例 1：
输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
输出：[[1,0,1],[0,0,0],[1,0,1]]

示例 2：
输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/

public class T4 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0){
                    list.add(new Integer[]{i,j});
                }
            }
        }
        for (Integer[] integers : list) {
            int i = integers[0];
            int j = integers[1];
            for (int k = 0; k < n; k++) {
                matrix[i][k]=0;
            }
            for (int k = 0; k < m; k++) {
                matrix[k][j]=0;
            }
        }
    }
}




    /**
     使用原地标记的方法将矩阵中为0的元素所在的行和列全部设置为0
     时间复杂度: O(m*n)，空间复杂度: O(1)

     @param matrix 输入的二维矩阵

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;      // 获取矩阵的行数
        int n = matrix[0].length;   // 获取矩阵的列数

        boolean firstRowZero = false;   // 记录第一行是否原本就有0
        boolean firstColZero = false;   // 记录第一列是否原本就有0

        // 1. 检查第一行是否有 0，如果有则标记
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // 2. 检查第一列是否有 0，如果有则标记
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // 3. 遍历矩阵内部（除第一行第一列），将为0元素的位置用第一行和第一列对应位置进行标记
        // 即：如果 matrix[i][j] == 0，则将 matrix[i][0] 和 matrix[0][j] 设置为0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;   // 在第一列对应的行位置标记
                    matrix[0][j] = 0;   // 在第一行对应的列位置标记
                }
            }
        }

        // 4. 根据第一行和第一列的标记信息，将矩阵内部（除第一行第一列）相应位置设置为0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 如果当前位置的行首或列首为0，说明该位置应该被设置为0
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 5. 如果第一行原本就有0，则将整行设置为0
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // 6. 如果第一列原本就有0，则将整列设置为0
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
*/