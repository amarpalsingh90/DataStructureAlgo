package com.dev.datastructurerepo.recursion

import java.util.ArrayList

fun main() {
    val arr: IntArray = intArrayOf(2, 3, 6, 7)
    val target = 7
    val output = combinationSum(arr, target)
    println(output.toString())
}

fun findCombinationSum(
    ind: Int,
    inputArr: IntArray,
    target: Int,
    ans: MutableList<MutableList<Int>>,
    ds: MutableList<Int>
) {
    if (ind == inputArr.size) {
        if (target == 0) {
            ans.add(ArrayList<Int>(ds))
        }
        return
    }
    if (inputArr[ind] <= target) {
        ds.add(inputArr[ind])
        findCombinationSum(ind, inputArr, target - inputArr[ind], ans, ds)
        ds.removeAt(ds.size - 1)
    }
    findCombinationSum(ind + 1, inputArr, target, ans, ds)
}

fun combinationSum(inputArr: IntArray, target: Int): List<List<Int>> {
    val result: MutableList<MutableList<Int>> = mutableListOf()
    findCombinationSum(0, inputArr, target, result, mutableListOf())
    return result

}