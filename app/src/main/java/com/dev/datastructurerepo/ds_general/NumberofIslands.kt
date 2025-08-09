package com.dev.datastructurerepo.ds_general

// LeetCode Link: https://leetcode.com/problems/number-of-islands/

fun main() {
    val grid: Array<CharArray> = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1'),
    )
    val output = numIslands(grid = grid)
    println("Number of Islands== $output")
}

fun numIslands(grid: Array<CharArray>): Int {
    if (grid.isEmpty() || grid[0].isEmpty()) {
        return 0
    }
    var count = 0

    for (i in 0 until grid.size) {
        for (j in 0 until grid[0].size) {
            if (grid[i][j] == '1') {
                dfg(grid, i, j)
                count++

            }
        }
    }
    return count
}

fun dfg(grid: Array<CharArray>, i: Int, j: Int) {
    if (i < 0 || i >= grid.size || j < 0
        || j >= grid[0].size || grid[i][j] == '0'
    ) {
        return;
    }

    grid[i][j] = '0'

    dfg(grid, i - 1, j)
    dfg(grid, i + 1, j)
    dfg(grid, i, j - 1)
    dfg(grid, i, j + 1)
}