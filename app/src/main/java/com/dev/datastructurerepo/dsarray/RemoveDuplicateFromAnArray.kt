package com.dev.datastructurerepo.dsarray

fun main() {
    val integerArray: IntArray = intArrayOf(1, 1, 1, 2, 2, 3, 3, 4, 4, 4)
    val output = removeDuplicates(integerArray)
    output.forEach { item ->
        print(item)
    }
}

fun removeDuplicates(numArray: IntArray): IntArray {
    if (numArray.isEmpty()) return intArrayOf() // Handle empty array
    var i = 0
    for (j in 1 until numArray.size) {
        if (numArray[j] != numArray[i]) {
            i++
            numArray[i] = numArray[j]
        }
    }
    return numArray
}

