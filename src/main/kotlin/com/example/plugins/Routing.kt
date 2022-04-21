package com.example.plugins

import com.example.routes.authorizedRoute
import com.example.routes.rootRoute
import com.example.routes.tokenVerificationRoute
import com.example.routes.unauthorizedRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        rootRoute()
        tokenVerificationRoute(application)
        authorizedRoute()
        unauthorizedRoute()
    }
}
