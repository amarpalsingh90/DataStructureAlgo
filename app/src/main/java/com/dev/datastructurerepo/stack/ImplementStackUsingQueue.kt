package com.dev.datastructurerepo.stack

import java.util.LinkedList
import java.util.Queue

fun main() {
    val stack = MyStack()
    stack.push(1)
    stack.push(2)
    stack.push(12)
    stack.push(24)
    stack.push(30)
    println(stack.top())
    println(stack.pop())
    println(stack.empty())
}


class MyStack() {

    val queue: Queue<Int> = LinkedList()

    fun push(x: Int) {
        queue.add(x)
        for (i in 1..<queue.size) {
            queue.add(queue.remove())
        }
    }

    fun pop(): Int {
        return queue.remove()
    }

    fun top(): Int {
        return queue.peek()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}