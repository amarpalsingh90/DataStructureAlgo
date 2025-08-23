package com.dev.datastructurerepo.queue

import java.util.Stack


fun main(){
    val queue = MyQueue()
    queue.push(1)
    queue.push(2)
    queue.push(12)
    queue.push(24)
    queue.push(30)
    println(queue.peek())
    println(queue.pop())
    println(queue.empty())
}

class MyQueue() {
    val inputStack= Stack<Int>()
    val outputStack= Stack<Int>()

    fun push(x: Int) {
        inputStack.push(x)
    }

    fun pop(): Int {
        peek()
        return  outputStack.pop()
    }

    fun peek(): Int {
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop())
            }
        }
        return outputStack.peek()
    }

    fun empty(): Boolean {
        return outputStack.isEmpty() && inputStack.isEmpty()
    }

}
