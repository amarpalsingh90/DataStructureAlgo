package com.dev.datastructurerepo.ds_string

fun main(){
    val input= "I am Sad"
    val needle = "Sad"
    val output= findTheFirstIndexOfTheOcc(input, needle)
    println("First Index: $output")
}

fun findTheFirstIndexOfTheOcc(str: String, needle:String): Int{

    for( i in 0 until (str.length-needle.length+1)){
        if(str[i] ==needle[0]){
           if( str.substring(i,needle.length+i).equals(needle)){
               return i
           }
        }
    }
    return -1

}