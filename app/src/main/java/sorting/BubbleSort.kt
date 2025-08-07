package sorting

fun main() {
    val intArray = intArrayOf(12, 245, 25, 46, 27, 8, 9, 16, 12, 45, 23, 67, 78)
    bubbleSort(intArray)
    println(bubbleSort(intArray).asList())
}

fun bubbleSort(intArray: IntArray): IntArray {
    for (i in intArray.size - 1 downTo 0) {
        for (j in 0..<i) {
            if (intArray[j] > intArray[j + 1]) {
                val temp = intArray[j + 1]
                intArray[j + 1] = intArray[j]
                intArray[j] = temp
            }
        }
    }
    return intArray
}



