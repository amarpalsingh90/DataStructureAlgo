package sorting

fun main() {
    val myArray: IntArray = intArrayOf(12, 245, 25, 46, 27, 8, 9, 16, 12, 45, 23, 67, 78)
    println(selectionSort(myArray).asList())
}

fun selectionSort(intArray: IntArray): IntArray {
    for (i in 0..intArray.size - 2) {
        var minIndex = i
        for (j in i..<intArray.size) {
            if (intArray[j] < intArray[minIndex]) minIndex = j
        }
        val temValue = intArray[minIndex]
        intArray[minIndex] = intArray[i]
        intArray[i] = temValue

    }
    return intArray
}