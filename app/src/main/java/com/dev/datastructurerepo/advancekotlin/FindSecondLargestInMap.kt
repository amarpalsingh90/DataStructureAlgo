package com.dev.datastructurerepo.advancekotlin

import java.util.*
import  java.util.Map.*

fun main(){
    val dataMap: MutableMap<String, Int> = mutableMapOf()
    dataMap["Ram"] = 1000
    dataMap["ShRam"] = 5000
    dataMap["Mansi"] = 14000
    dataMap["Geeta"] = 7000
    dataMap["Sita"] = 16000
    dataMap["Meeta"] = 60000

    val secondLargestValue = dataMap.entries
        .stream()
        .sorted(Collections.reverseOrder(Entry.comparingByValue()))
        .skip(1)
        .findFirst()
        .get()
    println(secondLargestValue.toString())
}