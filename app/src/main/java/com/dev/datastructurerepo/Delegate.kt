package com.dev.datastructurerepo
import kotlin.properties.Delegates

class MyClass {
    // The observable property will trigger the callback whenever its value is changed.
    var observableProperty: String by Delegates.observable("<initial value>") { prop, old, new ->
        // This block will be executed whenever the observableProperty is changed.
        println("Property ${prop.name} changed from $old to $new")
    }
}

fun main() {
    val obj = MyClass()

    // Modify the observable property and trigger the callback
    obj.observableProperty = "New Value 1"
    obj.observableProperty = "New Value 2"
    obj.observableProperty = "New Value 3"
}