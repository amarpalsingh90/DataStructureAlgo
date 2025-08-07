package com.dev.datastructurerepo.dsarray

import androidx.collection.MutableIntSet
import androidx.collection.mutableIntSetOf

fun main() {
    val integerArray: IntArray = intArrayOf(1, 1, 1, 2, 2, 3, 3, 4, 4, 4)
    val output = removeDuplicatesUsingSet(integerArray)
    print(output)
}

fun removeDuplicatesUsingSet(numArray: IntArray): String {
    if (numArray.isEmpty()) return "" // Handle empty array
     val mySet: MutableIntSet = mutableIntSetOf()
    numArray.forEach { item->
        mySet.add(item)
    }
    return mySet.toString()
}