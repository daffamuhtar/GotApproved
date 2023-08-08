package com.daffamuhtar.gotapproved

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform