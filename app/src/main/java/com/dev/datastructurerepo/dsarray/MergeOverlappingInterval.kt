package com.dev.datastructurerepo.dsarray

import java.util.Arrays
import kotlin.math.max


fun main() {
    val input: Array<IntArray> = arrayOf(
        intArrayOf(1, 5),
        intArrayOf(2, 4),
        intArrayOf(6, 7),
        intArrayOf(7, 9),
        intArrayOf(7, 11),
        intArrayOf(8, 13),
        intArrayOf(9, 15),
        intArrayOf(10, 14),
        intArrayOf(17, 21),
        intArrayOf(19, 24),
        intArrayOf(22, 23),
        intArrayOf(28, 30)
    )
    val output = merge(input)
    output.forEach { println(it.toList()) }
}

fun merge(intervals: Array<IntArray>?): Array<IntArray> {
    val res: MutableList<IntArray> = ArrayList()
    if (intervals!!.isEmpty()) return res.toTypedArray<IntArray>()
    Arrays.sort(
        intervals
    ) { a: IntArray, b: IntArray ->
        a[0].compareTo(b[0])
    }
    var start = intervals[0][0]
    var end = intervals[0][1]
    for (item in intervals) {
        if (item[0] <= end) {
            end = max(end, item[1])
        } else {
            res.add(intArrayOf(start, end))
            start  = item[0]
            end  = item[1]
        }
    }
    res.add(intArrayOf(start, end))
    return res.toTypedArray()
}

