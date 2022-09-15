package com.example.plugins

import com.example.models.Employee
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import routes.customerRouting
import routes.employeeRouting
import routes.listOrdersRoute

fun Application.configureRouting() {
    routing {
        customerRouting()
        employeeRouting()
        listOrdersRoute()
    }
}
