package com.dev.datastructurerepo.dsarray

fun main() {
    val arr: IntArray = intArrayOf(1, 2, 4, 6)
    val add = 9981
    val result = addToArrayForm(arr, add)
    println(result.toString())
}

fun addToArrayForm(num: IntArray, k: Int): List<Int> {
    var numberToAdd = k
    var carry = 0
    var p = num.size - 1
    val result: MutableList<Int> = mutableListOf()
    while (p >= 0 || numberToAdd > 0) {
        val posValue = if (p >= 0) num[p] else 0
        val lastDigit = numberToAdd % 10
        val sum = posValue + lastDigit + carry
        val digit = sum % 10
        carry = sum / 10
        result.add(0, digit)
        p--
        numberToAdd = numberToAdd / 10
    }
    if (carry > 0) result.add(0, carry)

    return result
}