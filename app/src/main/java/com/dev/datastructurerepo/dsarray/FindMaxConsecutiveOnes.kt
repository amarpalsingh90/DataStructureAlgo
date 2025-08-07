package com.dev.datastructurerepo.dsarray

import kotlin.math.max

fun main(){
   val arr:IntArray = intArrayOf(1,0,1,1,1,1,1,1,0,0,0,1,1,1,1,1,0,1)
    val output= findMaxConsecutiveOnes(arr)
    println("Maximum consecutive Ones are: $output")
}

fun findMaxConsecutiveOnes(nums: IntArray):Int{
    var maxi = 0
    var count = 0

    for(i in nums){
        if(i==1){
            count+=1
            maxi = max(count, maxi)
        }else {
            count=0
        }
    }
    return maxi
}