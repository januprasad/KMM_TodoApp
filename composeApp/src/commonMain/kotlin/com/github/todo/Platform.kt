package com.github.todo
interface Platform {
    val name: String
}

expect fun getPlatform(): Platform