package com.dev.datastructurerepo.ds_string

import java.util.Arrays


fun main(){
    val str: Array<String> = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val output =  groupAnagramsCategorizeBySorting(str)
    println(output.toList())
}

fun groupAnagramsCategorizeBySorting(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return mutableListOf()
    val stringAnagramsMap: MutableMap<String, MutableList<String>> = mutableMapOf()
    strs.forEach { str ->
        val frequencyStr= getFrequencyString(str)
        if (stringAnagramsMap.contains(frequencyStr)){
            stringAnagramsMap[frequencyStr]?.add(str)
        } else {
           val newStar: MutableList<String> = mutableListOf()
            newStar.add(str)
            stringAnagramsMap[frequencyStr]= newStar
        }
    }
    return stringAnagramsMap.values.toList()
}

fun getFrequencyString(str: String): String {
    // Frequency buckets
    val freq = IntArray(26)
    // Iterate over each character
    str.forEach { ch ->
        freq[ch.code - 'a'.code]++
    }
    // Start creating the frequency string
    val frequencyString = StringBuilder("")
    var c = 'a'
    for (i in freq) {
        frequencyString.append(c)
        frequencyString.append(i)
        c++
    }

    return frequencyString.toString()
}