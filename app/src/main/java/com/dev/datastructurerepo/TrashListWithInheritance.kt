package com.dev.datastructurerepo

class TrashListWithInheritance<T>(override val size: Int) : ArrayList<T>() {

    private val innerList: MutableList<T> = ArrayList()

    // the variable for storing the last deleted item
    private var deletedItem : T? = null

    override fun remove(element: T): Boolean {
        deletedItem = element
        // calling ArrayList's method, not our implementation
        return innerList.remove(element)
    }

    // here is our own function for recovering elements
    fun recover(): T? {
        return deletedItem
    }

    override fun add(element: T): Boolean {
        // calling ArrayList's method, not our implementation
       return innerList.add(element)
    }


}
