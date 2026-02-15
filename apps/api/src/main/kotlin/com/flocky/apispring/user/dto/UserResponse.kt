package com.flocky.apispring.user.dto

import com.flocky.apispring.user.User
import java.time.Instant
import java.util.UUID

data class UserResponse(
    val id: UUID,
    val email: String,
    val name: String,
    val emailVerified: Boolean,
    val createdAt: Instant,
    val updatedAt: Instant,
) {
    companion object {
        fun from(user: User): UserResponse =
            UserResponse(
                id = user.id!!,
                email = user.email,
                name = user.name,
                emailVerified = user.emailVerified,
                createdAt = user.createdAt,
                updatedAt = user.updatedAt,
            )
    }
}
