package com.dev.datastructurerepo.ds_string

import kotlin.math.max

fun main() {
    val inputStr = "abcdeabcbb"
    val output = lengthOfLongestSubstring(inputStr)
    println("max Length str: $output")
}

fun lengthOfLongestSubstring(str: String): Int {
    var longestSubStrLength = 0
    val mHashSet: MutableSet<Char> = mutableSetOf()
    var leftPtr = 0
    str.forEachIndexed { index, ch ->
        while (mHashSet.contains(ch)) {
            mHashSet.remove(str.get(leftPtr))
            leftPtr++
        }
        mHashSet.add(ch)
        longestSubStrLength = max(longestSubStrLength, index - leftPtr + 1)
    }
    return longestSubStrLength
}