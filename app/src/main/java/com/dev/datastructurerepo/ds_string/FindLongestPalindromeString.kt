package com.dev.datastructurerepo.ds_string

fun main(){
    val output= longestPalindrome("ABCCBCDDGFDVCVVFC")
    println(output)
}

fun longestPalindrome(s: String): String {
    if (s.length <= 1) {
        return s
    }

    var maxLen = 1
    var maxStr = s.substring(0, 1)

    for (i in 0 until s.length) {
        for (j in i + maxLen..s.length) {
            if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                maxLen = j - i
                maxStr = s.substring(i, j)
            }
        }
    }

    return maxStr
}

private fun isPalindrome(str: String): Boolean {
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left] != str[right]) {
            return false
        }
        left++
        right--
    }

    return true
}