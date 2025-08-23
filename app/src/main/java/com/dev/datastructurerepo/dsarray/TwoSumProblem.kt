package com.dev.datastructurerepo.dsarray

import java.util.Arrays

fun main() {
    val myArray: IntArray = intArrayOf(2, 7, 11, 15, 6)
    val output = findPairIndexToTarget(9, myArray)
    println("Matching Pair is : ${output?.asList()}")

    val output2 = findPairIndexToTarget(8, myArray)
    println("Matching Pair is : ${output2?.asList()}")
    val output3 = findPairIndexUsingTwoPointer(myArray, 18)
    println("Matching Pair is : ${output3?.asList()}")
}

fun findPairIndexToTarget(target: Int, inputArray: IntArray): IntArray? {
    val mMap: MutableMap<Int, Int> = mutableMapOf()
    for (i in inputArray.indices) {
        val complement = target - inputArray[i]
        if (mMap.contains(complement)) {
            return mMap[complement]?.let { intArrayOf(it, i) }
        } else {
            mMap[inputArray[i]] = i
        }
    }
    return null
}

fun findPairIndexUsingTwoPointer(inpurArray: IntArray, target: Int): IntArray? {
    val sortedArray = inpurArray.sortedArray()
    var leftPtr = 0
    var rightPtr = sortedArray.size - 1

    while (leftPtr < rightPtr) {
        val sum = sortedArray[leftPtr] + sortedArray[rightPtr]
        if (sum == target) {
            return intArrayOf(leftPtr, rightPtr)
        } else if (sum < target) {
            leftPtr++
        } else {
            rightPtr--
        }
    }
    return null
}