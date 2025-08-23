package com.dev.datastructurerepo


fun main (){
    val sumOfTheNumbers= addTwoNumber(a =10, b =50){num1, num2 -> num1+num2 }
    val sumOfTheNumbers2= addTwoNumber(a =10, b =30, sum = {a,b-> a+b})
    val sumOfTheNumbers3= addTwoNumber(a =10, b =64, sum = {a,b-> a+b})
    println("$sumOfTheNumbers   $sumOfTheNumbers2    $sumOfTheNumbers3")
}


 inline fun addTwoNumber(a:Int, b:Int, sum: (Int, Int) -> Int) : Int {
   return  sum.invoke(a,b)
}