package com.dev.datastructurerepo.dsarray

fun main(){
   val output= findMajorityElement(intArrayOf(3,3,2,2,2,2,1,1,1,1,1,1,2,3))
    println("majority element== $output" )
}

fun findMajorityElement(nums: IntArray) : Int{
    var candidate=0
    var count =0
    for (i in nums){
        if(count==0){
            candidate = i
        }
        if(candidate==i){
            count++
        }else {
            count--
        }
    }
    return candidate
}