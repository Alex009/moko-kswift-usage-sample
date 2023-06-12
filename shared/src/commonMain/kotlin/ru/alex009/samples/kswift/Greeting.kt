package ru.alex009.samples.kswift

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}