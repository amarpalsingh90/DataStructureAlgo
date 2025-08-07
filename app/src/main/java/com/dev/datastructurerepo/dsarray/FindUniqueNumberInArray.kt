package com.dev.datastructurerepo.dsarray

fun main(){
    val intArray:IntArray = intArrayOf(1,2,2,5,4,3,3,5,4,1)
    println(intArray.size)
  val output =  removeElement(intArray,4)
    println(output)
}

fun removeElement(nums: IntArray, value: Int): Int {
    var i = 0
    for (j in nums.indices) {
        if (nums[j] != value) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
        }
    }
    return i
}