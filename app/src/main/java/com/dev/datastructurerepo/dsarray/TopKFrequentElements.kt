package com.dev.datastructurerepo.dsarray


fun main(){
    val arr: IntArray= intArrayOf(1,1,1,1,1,1,2,2,2,2,3, 5,5,5,5,5)
    val output= topKFrequent(arr, 2)
    println("TopKFrequentElement: ${output?.toList()}")
}
fun topKFrequent(arr: IntArray, k: Int): IntArray? {
    val bucket: Array<MutableList<Int?>?> = arrayOfNulls<MutableList<Int?>?>(arr.size + 1)
    val frequencyMap: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()

    for (item in arr) {
        frequencyMap.put(item, frequencyMap.getOrDefault(item, 0)!! + 1)
    }

    for (key in frequencyMap.keys) {
        val frequency: Int = frequencyMap.get(key)!!
        if (bucket[frequency] == null) {
            bucket[frequency] = ArrayList<Int?>()
        }
        bucket[frequency]!!.add(key)
    }

    val topK: MutableList<Int?> = ArrayList<Int?>()
    var pos = bucket.size - 1
    while (pos >= 0 && topK.size < k) {
        if (bucket[pos] != null) {
            topK.addAll(bucket[pos]!!)
        }
        pos--
    }

    return topK.stream().mapToInt { i: Int? -> i!! }.toArray()
}