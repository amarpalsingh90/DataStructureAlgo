package com.dev.datastructurerepo.dsarray

fun main(){
    val inputArray= intArrayOf(1,2,3,4,5,6,7)
    val size= inputArray.size
    val k = 2
    // output == [6, 7, 1, 2, 3,4,5]
    reverseArray(inputArray,0,size-k-1 )
    reverseArray(inputArray,size-k,size-1 )
    reverseArray(inputArray,0,size-1 )
    println(inputArray.toList().toString())

}

fun reverseArray(intArray: IntArray,startIndex:Int, endIndex:Int){
     var i= startIndex
     var j= endIndex
    while (i<j){
      val temp  =intArray[i]
        intArray[i] = intArray[j]
        intArray[j]= temp
        i++
        j--
    }
}