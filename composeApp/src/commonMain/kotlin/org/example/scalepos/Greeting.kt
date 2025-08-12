package org.example.scalepos

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello welcome, ${platform.name}!"
    }
}