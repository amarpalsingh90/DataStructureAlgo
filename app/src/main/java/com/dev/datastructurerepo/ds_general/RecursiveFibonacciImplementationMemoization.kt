package com.dev.datastructurerepo.ds_general

fun main() {
    val fibArray = IntArray(8)
    println("Value of 7th number in Fibonacci series->" + fibonacci(7, fibArray))
    print("All fibonacci number:==  ${fibArray.toList()}")
}

fun fibonacci(n: Int, fibArray: IntArray): Int {
    if (n <= 1) {
        fibArray[n] = n
        return n
    } else if (fibArray[n] != 0) {
        return fibArray[n]
    } else {
        val fibValue = fibonacci(n - 1, fibArray) + fibonacci(n - 2, fibArray)
        fibArray[n] = fibValue
        return fibValue
    }
}

