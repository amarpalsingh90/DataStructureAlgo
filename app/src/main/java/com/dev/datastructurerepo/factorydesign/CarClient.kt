package com.dev.datastructurerepo.factorydesign

fun main(){
   val carFactoryProvider= CarFactoryProvider()
    val getCar: GetCar=carFactoryProvider.getCar("Tata")
    getCar.carProperty()
    val num1:Int = 5
    val mum3: Int = 11
    val sum= mum3.plus(num1)
}