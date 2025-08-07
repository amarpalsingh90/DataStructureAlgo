package com.dev.datastructurerepo

class TrashListWithDelegate <T>(
    private val innerList: MutableList<T> = ArrayList()
) : MutableList<T> by innerList {
    private var deletedItem : T? = null
    override fun remove(element: T): Boolean {
        deletedItem = element
        return innerList.remove(element)
    }
    fun recover(): T? {
        return deletedItem
    }
}