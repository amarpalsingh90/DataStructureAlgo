package com.dev.datastructurerepo.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    asyncParallelExecutionTesting()
    //asyncSerialExecutionTesting()
}


fun asyncParallelExecutionTesting(){
    runBlocking {
        val time = System.currentTimeMillis()
        val parentDeferred= async {
            val deferredA = async {
                delay(4000)
                println("A")
            }
            val deferredB = async {
                delay(3000)
                println("B")
            }

            val deferredC = async {
                delay(2000)
                println("C")
            }
            deferredA.await()
            deferredB.await()
            deferredC.await()
        }
        parentDeferred.await()
        println(System.currentTimeMillis() - time)
    }
}

fun asyncSerialExecutionTesting(){
    runBlocking {
        val time = System.currentTimeMillis()
        val parentDeferred= async {
            val deferredA = async {
                delay(4000)
                println("A")
            }
            deferredA.await()
            val deferredB = async {
                delay(3000)
                println("B")
            }
            deferredB.await()
            val deferredC = async {
                delay(2000)
                println("C")
            }
            deferredC.await()
        }
        parentDeferred.await()
        println(System.currentTimeMillis() - time)
    }
}