package se.callistaenterprise.demo

import org.xml.sax.ContentHandler
import org.xml.sax.helpers.DefaultHandler

// Kotlin has property delegation built into the language
class MyLazyClass(val initializer: () -> Int) {
    val lazyValue: Int by lazy { initializer() }
}

fun testMyLazyClass() {
    val myLazy = MyLazyClass({ 5 + 7})
}

// Classes can implement interfaces through delegation
class MyActionListener: ContentHandler by DefaultHandler() {
}
