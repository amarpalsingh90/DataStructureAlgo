package com.dev.datastructurerepo.dsarray

fun main() {
    val inputArray: IntArray = intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3)
    val maxSum = findMaxSubArraySum(inputArray)
    println("Maximum sub array sum is ==  $maxSum")
}

fun findMaxSubArraySum(inputArray: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var sum = 0
    var startIndex = 0
    var endIndex = 0
    for (i in inputArray.indices) {
        if (sum == 0) {
            startIndex = i
        }
        sum += inputArray[i]
        if (sum > maxSum) {
            maxSum = sum
            endIndex = i
        }
        if (sum < 0) {
            sum = 0
        }
    }
    println("Start Index of the array is $startIndex and EndIndex is $endIndex")
    val maximumSubArray = IntArray(endIndex - startIndex + 1)
    for (i in maximumSubArray.indices) {
        maximumSubArray[i] = inputArray[startIndex + i]
    }
    println("subArray is == ${maximumSubArray.toList()}")
    return maxSum;
}