fun main() {
    val pivotIndex = getPivotIndexOfArray(intArrayOf(1, 2, 3, 6, 7, 7, 5))
    println("Pivot index is== : $pivotIndex")

    val pivotIndex2 = getPivotIndexOfArray(intArrayOf(1, 9, 3, 6, 1, 1, 7, 7, 5, 1))
    println("Pivot index is== : $pivotIndex2")




}


fun getPivotIndexOfArray(intArray: IntArray): Int {
    var leftSum: Int = 0
    var rightSum: Int = 0

    for (item in intArray) {
        rightSum += item
    }
    for (i in 0 until intArray.size) {
        rightSum -= intArray[i]
        if (leftSum == rightSum) {
            return i
        }
        leftSum += intArray[i]
    }
    return -1
}

