package com.dev.datastructurerepo.dsarray

import java.util.Arrays

fun main(){
   val output= threeSum(intArrayOf(-1,0,1,2,-1,-4))
    output.forEach{ subArray->
        println(subArray)
    }
}

    fun threeSum(nums: IntArray): List<List<Int>> {
        val n = nums.size
        val result: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)

        for (i in 0 until n) {
            if (i != 0 && nums[i] == nums[i - 1]) continue
            var left = i + 1
            var right = n - 1
            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]
                if (sum > 0) {
                    right--
                } else if (sum < 0) {
                    left++
                } else {
                    val ls = Arrays.asList(nums[i], nums[left], nums[right])
                    result.add(ls)
                    left++
                    right--

                    while (left < right && nums[left] == nums[left - 1]) left++
                    while (left < right && nums[right] == nums[right + 1]) right--
                }
            }
        }
        return result
    }


