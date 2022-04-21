package com.example.plugins

import com.example.domain.model.UserSession
import io.ktor.server.application.*
import io.ktor.server.sessions.*
import io.ktor.util.*
import java.io.File

fun Application.configureSession() {
    install(Sessions) {
        val secretEncryptionKey = hex("3983294ehu3249283h3493243h2u283")
        val secretAuthKey = hex("324324766egrg4324543h4234243h2u283")

        cookie<UserSession>(
            name = "USER_SESSION",
            storage = directorySessionStorage(File(".sessions"))
        ) {
            transform(SessionTransportTransformerEncrypt(secretEncryptionKey, secretAuthKey))
        }
    }
}