package com.dev.datastructurerepo.dsarray

fun main() {
    val myArray: IntArray = intArrayOf(2, 7,11,15,6)
    val output= findPairIndexToTarget(9, myArray)
    println("Matching Pair is : ${output?.asList()}")

    val output2= findPairIndexToTarget(8, myArray)
    println("Matching Pair is : ${output2?.asList()}")
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
    return  null
}