package com.dev.datastructurerepo.dsarray


fun main(){
    val output= majorityElement(intArrayOf(2,2,1,1,1,1,1,1,2,2))
    println("Majority Element== $output")
}

fun majorityElement(nums: IntArray): Int {
    var count = 0
    var maj = -1
    for (i in nums.indices) {
        if (count == 0) {
            maj = nums[i]
            count++
        } else if (maj == nums[i]) count++
        else count--
    }
    count = 0
    for (n in nums) {
        if (n == maj) count++
    }

    return if (count > nums.size / 2) maj else -1
}