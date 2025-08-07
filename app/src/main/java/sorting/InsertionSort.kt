package sorting

fun main() {
    val intArray = intArrayOf(12, 245, 25, 46, 27, 8, 9, 16, 22, 45, 23, 67, 78)
    insertionSort(intArray)
    println(bubbleSort(intArray).asList())
}

fun insertionSort(intArray: IntArray): IntArray {
    for (i in intArray.indices) {
        val j = i
        while (j > 0 && intArray[j - 1] > intArray[j]) {
            val temp = intArray[j - 1]
            intArray[j - 1] = intArray[j]
            intArray[j] = temp
        }
    }
    return intArray
}
