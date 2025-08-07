package com.dev.datastructurerepo.dsarray

fun main(){
    val intArray:IntArray= intArrayOf(1,0,5,7,0,0,9,7,0,0,0,0,10)
    val output= moveZeroes(intArray)
    println(output.toList().toString())
}

fun moveZeroes(nums: IntArray): IntArray {
    var j= -1
    for (i in nums.indices){
        if(nums[i]==0){
            j=i
            break
        }
    }
    for (i in j+1  until nums.size){
        if(nums[i]!=0){
            val temp= nums[i]
            nums[i] = nums[j]
            nums[j]= temp
            j++
        }
    }
    return nums
}