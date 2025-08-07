package com.dev.datastructurerepo.dsarray

import kotlin.math.absoluteValue

fun main(){
    val inputList= mutableListOf<Int>()
    inputList.add(1111)
    inputList.add(999)
    inputList.add(888)
    inputList.add(777)
    inputList.add(9)
    inputList.add(91)
    inputList.add(99999)
    println(findMinMaxSubArrarySize(inputList))
}

fun findMinMaxSubArrarySize(list: List<Int>) : Int{
    var min= list[0]
    var max = list[0]
    var minIndex= 0
    var maxIndex= 0

    list.forEachIndexed { index, value ->
       if(value<min){
           min = value
           minIndex = index
       }
        if(value> max){
            max = value
            maxIndex = index
        }
    }
    if(minIndex == maxIndex ){
        return 1
    } else {
        var sizeOfSubArray= (maxIndex -minIndex).absoluteValue
        sizeOfSubArray+=1
        return sizeOfSubArray
    }

}