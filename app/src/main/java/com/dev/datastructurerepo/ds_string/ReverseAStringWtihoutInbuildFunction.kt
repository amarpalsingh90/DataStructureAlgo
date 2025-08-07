package com.dev.datastructurerepo.ds_string

fun main(){
    println(reverseStringWithoutUsingAnyFun("My Name is Amar Pal Singh"))
}

fun reverseStringWithoutUsingAnyFun(input: String) :String{
    var myWorldString = ""
    var outputString = ""
    input.forEachIndexed { index, char ->
        if(char != ' ' && index < input.length-1){
            myWorldString += char
        } else if (index < input.length-1){
            outputString=  char + myWorldString + outputString
            myWorldString = ""
        } else{
            outputString =   myWorldString + char + outputString
            myWorldString =""
            println("Testing $index and $char")
        }
    }
    return outputString
}