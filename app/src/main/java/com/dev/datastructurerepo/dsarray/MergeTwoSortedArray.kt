package com.dev.datastructurerepo.dsarray


fun main(){
    val num1: IntArray= intArrayOf(1,2,3,0,0,0)
    val num2:IntArray= intArrayOf(2,5,6)
    val m= 3
    val n= 3
    val output= mergeTwoSortedArray(num1,num2, m, n)
    println(output.toList().toString())
}

fun mergeTwoSortedArray(num1: IntArray, num2: IntArray, m:Int, n: Int) : IntArray{
    var i= m-1
    var j= n-1
    var k= m+n-1

    while (j>=0  && i>=0){
        if( num1[i]>num2[j]){
            num1[k]= num1[i]
            k--
            i--
        }else {
            num1[k]= num2[j]
            j--
            k--
        }
    }
    return num1
}