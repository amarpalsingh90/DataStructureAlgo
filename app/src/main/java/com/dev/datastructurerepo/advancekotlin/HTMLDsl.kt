package com.dev.datastructurerepo.advancekotlin

// Define a DSL for building HTML
class HTML {
    private val children = mutableListOf<String>()

    fun body(block: Body.() -> Unit) {
        val body = Body().apply(block)
        children.add("<body>${body.render()}</body>")
    }

    fun render(): String = "<html>\n${children.joinToString("\n")}\n</html>"
}

class Body {
    private val children = mutableListOf<String>()

    fun p(text: String) {
        children.add("<p>$text</p>")
    }

    fun render(): String = children.joinToString("\n")
}

// DSL builder function
fun html(block: HTML.() -> Unit): HTML {
    return HTML().apply(block)
}

// Usage
fun main() {
    val document = html {
        body {
            p("Hello, Kotlin DSL!")
            p("This is a custom DSL example.")
        }
    }

    println(document.render())
}
