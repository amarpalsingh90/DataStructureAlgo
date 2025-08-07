package com.dev.datastructurerepo.dsarray

import kotlin.math.max

fun main(){
  val inputArray:IntArray= intArrayOf(2,3,1,1,4)
    val canjump= canJump(inputArray)
    println("Can Jump: $canjump")
}

fun canJump(nums: IntArray): Boolean {
    if (nums.size == 1) {
        return true
    }
    val lastIndex = nums.size - 1
    var maxReach = nums[0]
    var i = 1
    while (maxReach >= i) {
        if (maxReach >= lastIndex) {
            return true
        } else {
            maxReach = max(maxReach, (nums[i] + i))
        }
        i++
    }
    return false
}