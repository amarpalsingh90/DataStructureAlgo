package com.dev.datastructurerepo.stack

import java.util.Stack

fun main() {
    val inputStr = "(){}({})"
    val output = validParentheses(inputStr)
    println("is Valid Parentheses: $output")
}


fun validParentheses(input: String): Boolean {
    val stack = Stack<Char>()

    for (ch in input) {
        if (stack.isNotEmpty() && ch == ')' && stack.peek() == '(') {
            stack.pop()
            continue
        }
        if (stack.isNotEmpty() && ch == ']' && stack.peek() == '[') {
            stack.pop()
            continue
        }
        if (stack.isNotEmpty() && ch == '}' && stack.peek() == '{') {
            stack.pop()
            continue
        }
        stack.push(ch)
    }

    return stack.isEmpty()
}
