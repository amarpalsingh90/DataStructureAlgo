package com.dev.datastructurerepo.ds_general

import kotlin.math.sqrt

fun main(){
     println("Number is Prime== ${checkNumberIsPrime(3)}")
     println("Number is Prime== ${checkNumberIsPrime(1)}")
     println("Number is Prime== ${checkNumberIsPrime(31)}")
     println("Number is Prime== ${checkNumberIsPrime(16)}")
     println("Number is Prime== ${checkPrimeFunc(17)}")
     println("Number is Prime== ${checkPrimeFunc(18)}")
     println("Number is Prime== ${checkPrimeFunc(19)}")
     println("Number is Prime== ${checkPrimeFunc(21)}")
     println("Number is Prime== ${checkPrimeFunc(29)}")
}


fun checkNumberIsPrime(item:Int): Boolean{

    var totalDivisibleNumber= 0

    if(item==2){
        return  true
    } else {
        for (i in 1..item) {
            if (item % i === 0) {
                totalDivisibleNumber++
            }
        }
        // checking number of counts to print result
        if (totalDivisibleNumber == 2) {
           return true
        } else {
           return  false
        }
    }
}

fun checkPrimeFunc(nums: Int): Boolean {
    if (nums <= 1) {
        return false
    }
    var i = 2
    println("Square Root: ${sqrt(nums.toDouble())}")
    while (i <= sqrt(nums.toDouble())) {
        if (nums % i == 0) {
            return false
        }
        i++
    }
    return true
}