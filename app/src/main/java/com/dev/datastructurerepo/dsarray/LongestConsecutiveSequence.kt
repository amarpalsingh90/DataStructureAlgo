package com.dev.datastructurerepo.dsarray

import kotlin.math.max

fun main() {
    val intArray: IntArray = intArrayOf(100, 4, 200, 1, 3, 2)
    val output = longestConsecutive(intArray)
    println("Longest Sequence size== $output")
    val intArray2: IntArray = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
    val output2 = longestConsecutiveUsingSet(intArray2)
    println("Longest Sequence size== $output2")
}

fun longestConsecutive(nums: IntArray): Int {
    var longestSequenceSize = 0
    val exploredMap: MutableMap<Int, Boolean> = mutableMapOf()
    for (item in nums) {
        exploredMap.put(item, false)
    }

    for (item in nums) {
        var currentLength = 1
        var nextNum = item + 1
        //check in forward direction
        while (exploredMap.contains(nextNum) && exploredMap[nextNum] == false) {
            currentLength++
            exploredMap.put(nextNum, true)
            nextNum++
        }
        // check in backword direction
        var preNum = item - 1
        while (exploredMap.contains(preNum) && exploredMap[preNum] == false) {
            currentLength++
            exploredMap.put(nextNum, true)
            preNum--
        }
        longestSequenceSize = max(longestSequenceSize, currentLength)
    }
    return longestSequenceSize
}

// method 2nd vai using hasHSet

fun longestConsecutiveUsingSet(nums: IntArray): Int {
    val map = nums.toHashSet()
    var max = 0
    for (num in nums) {
        if (!map.contains(num)) {
            continue
        }
        var left = num
        var right = num
        while (map.contains(--left)) {
            map.remove(left)
        }
        while (map.contains(++right)) {
            map.remove(right)
        }

        var count = right - left - 1;
        if (count > max) {
            max = count
        }
    }
    return max
}