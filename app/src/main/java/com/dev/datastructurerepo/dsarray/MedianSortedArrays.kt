package com.dev.datastructurerepo.dsarray

fun main() {
    val nums1: IntArray = intArrayOf(1, 2, 6, 7, 20)
    val nums2: IntArray = intArrayOf(3, 4, 10, 20, 25)
    val output = findMedianSortedArrays(nums1, nums2)
    println("Median of two sorted array is : $output")
}


fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val m = nums1.size
    val n = nums2.size
    val sortedArray = IntArray(m + n)
    var i = 0
    var j = 0
    var k = 0
    while ((i < nums1.size && j < nums2.size)) {
        if (nums1[i] <= nums2[j]) {
            sortedArray[k++] = nums1[i++]
        } else {
            sortedArray[k++] = nums2[j++]
        }
    }

    if (i < nums1.size) {
        while (i < nums1.size) {
            sortedArray[k++] = nums1[i++]
        }
    }
    if (j < nums2.size) {
        while (j < nums2.size) {
            sortedArray[k++] = nums2[j++]
        }
    }
    println(sortedArray.toList())
    val isEvenNumberSize = sortedArray.size % 2 == 0
    return if (isEvenNumberSize) {
        (sortedArray[(sortedArray.size / 2) - 1] + sortedArray[(sortedArray.size / 2)]) / 2.0
    } else {
        sortedArray[sortedArray.size / 2].toDouble()
    }
}


