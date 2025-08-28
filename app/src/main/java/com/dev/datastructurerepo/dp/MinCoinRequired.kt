package com.dev.datastructurerepo.dp

import kotlin.math.min

//https://leetcode.com/problems/coin-change/

fun main(){
    val coins:IntArray= intArrayOf(1,2,5)
    val amount= 11
   val output= minCoinRequired(coins,amount)
    println("Min coin== $output")
}


fun minCoinRequired(coins: IntArray, amount:Int): Int{

    // Check edge case
    if (amount < 1) return 0
    // Create DP array
    val minCoinsDP = IntArray(amount + 1)

    for (i in 1..amount) {
        minCoinsDP[i] = Int.Companion.MAX_VALUE

        // Try each coin
        for (coin in coins) {
            if (coin <= i && minCoinsDP[i - coin] != Int.Companion.MAX_VALUE)
                minCoinsDP[i] = min(minCoinsDP[i], 1 + minCoinsDP[i - coin])
        }
    }
    return if (minCoinsDP[amount] == Int.Companion.MAX_VALUE) -1 else minCoinsDP[amount]
}