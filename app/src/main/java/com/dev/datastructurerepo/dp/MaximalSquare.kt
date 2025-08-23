package com.dev.datastructurerepo.dp

fun main(){
    val  matrix: Array<CharArray> = arrayOf(
        charArrayOf('1', '0', '1', '0', '0'),
        charArrayOf('1', '0', '1', '1', '1'),
        charArrayOf('1', '1', '1', '1', '1'),
        charArrayOf('1', '0', '1', '1', '1')
    )
    val output= maximumSquare(matrix)
    println("Maximum Square== $output")
}

fun maximumSquare(matrix: Array<CharArray>): Int {
    if (matrix.isEmpty() || matrix[0].isEmpty()) {
        return 0
    }
    val rows = matrix.size
    val cols = matrix[0].size
    val dp = Array(rows) { IntArray(cols) }
    var maxSide = 0
    for (i in 0 until rows) {
        for(j in 0 until cols){
            if (matrix[i][j] == '1') {
                // Special handling for the first row and first column
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                // For others, dp[i][j] is the minimum of the three neighbors
                    dp[i][j] = 1 +
                            Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);

                maxSide = Math.max(maxSide, dp[i][j]);
            }
            }
    }

    return maxSide * maxSide;
}