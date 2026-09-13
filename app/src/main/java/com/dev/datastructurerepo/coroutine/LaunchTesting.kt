package com.dev.datastructurerepo.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(){
    launchParallelTesting()
    //launchSerialTesting()
}

fun launchSerialTesting(){
    runBlocking {
        val time = System.currentTimeMillis()
        val parentJob = launch {
            val jobA = launch {
                delay(4000)
                println("A")
            }
            jobA.join()
            val jobB = launch {
                delay(3000)
                println("B")
            }
            jobB.join()
            val jobC = launch {
                delay(2000)
                println("C")
            }
            jobC.join()
        }
        parentJob.join()
        println(System.currentTimeMillis() - time)
    }
}

fun launchParallelTesting(){
    runBlocking {
        val time = System.currentTimeMillis()
        val parentJob = launch {
            val jobA = launch {
                delay(4000)
                println("A")
            }
            //jobA.join()
            val jobB = launch {
                delay(3000)
                println("B")
            }
            //jobB.join()
            val jobC = launch {
                delay(2000)
                println("C")
            }
           // jobC.join()
        }
        parentJob.join()
        println(System.currentTimeMillis() - time)
    }
}