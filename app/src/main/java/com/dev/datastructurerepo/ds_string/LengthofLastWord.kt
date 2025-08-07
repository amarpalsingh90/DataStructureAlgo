package com.dev.datastructurerepo.ds_string

fun main(){
    val str= " Lets fly to the moon "
    val output= findLengthOfLastWord(str)
    println("Length of the last word: $output")
}


fun findLengthOfLastWord(input:String): Int {
    val str = input.trim()
    var count= 0
    for (i in str.length - 1 downTo 1) {
            if (str.get(i) != ' ') {
                count++
            } else {
                break
            }
        }
        return count
}

