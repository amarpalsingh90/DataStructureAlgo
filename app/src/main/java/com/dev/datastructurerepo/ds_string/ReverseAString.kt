import java.util.Stack

fun main(){
    println("Hello Kotlin")
    val output= reverseWordsInSentenceUsingStack("Amar Pal Singh")
    println(output)
}

fun reverseWordsInSentenceUsingStack(sentence: String): String {
    val stack = Stack<String>()
    val words = sentence.split(" ")
    for (word in words) {
        stack.push(word)
    }
    val reversedSentence = StringBuilder()
    while (!stack.empty()) {
        reversedSentence.append("${stack.pop()} ")
    }
    return reversedSentence.toString().trim()
}