package com.dev.datastructurerepo.dp

import kotlin.math.max

fun main() {
    val dicList: MutableList<String> =
        mutableListOf("cats", "dog", "sand", "and", "cat", "cat", "cat")
    val str = "catsandog"
    val output = findWordBreak(str, dicList)
    println(output)

    val dicList2: MutableList<String> = mutableListOf("leet", "code")
    val str2 = "leetcode"
    val output2 = findWordBreak(str2, dicList2)
    println(output2)

    val dicList3: MutableList<String> = mutableListOf("apple", "pen")
    val str3 = "applepenapple"
    val output3 = findWordBreak(str3, dicList3)
    println(output3)
}

fun findWordBreak(s: String, wordDict: List<String>): Boolean {
    val set = wordDict.toHashSet()
    var maxLen = 0
    for (i in wordDict) {
        maxLen = max(maxLen, i.length)
    }
    val dpArray = BooleanArray(s.length + 1)
    dpArray[0] = true
    for (i in 1..s.length) {
        // Check prefixes of length up to maxLen
        for (j in i - 1 downTo max(0, i - maxLen)) {
            if (dpArray[j] && set.contains(s.substring(j, i))
            ) {
                dpArray[i] = true
                break // No need to check further prefixes
            }
        }
    }
    return dpArray[s.length]
}