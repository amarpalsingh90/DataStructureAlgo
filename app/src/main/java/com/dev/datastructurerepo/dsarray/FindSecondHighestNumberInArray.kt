package com.dev.datastructurerepo.dsarray

import java.util.Comparator

fun main() {
    val list:List<Int> = arrayListOf(12, 24, 30, 44, 89, 5, 7)
    println(findSecondHighest(list))
}

private fun findSecondHighest(array: List<Int>): Int {
    val secondHighest = array.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
    return secondHighest.get()
}