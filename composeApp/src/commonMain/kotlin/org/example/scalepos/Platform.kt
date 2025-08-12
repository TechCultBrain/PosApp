package org.example.scalepos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform