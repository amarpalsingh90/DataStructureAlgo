package com.dev.datastructurerepo.ds_string

fun main(){
  val output = reverseWords("Hello Amar Pal Singh")
    println(output)
}
fun reverseWords(input: String): String {
    val idx = input.indexOf(' ')
    if (idx == -1) return input
    return reverseWords(input.substring(idx + 1)) + ' ' + input.substring(0, idx)
}