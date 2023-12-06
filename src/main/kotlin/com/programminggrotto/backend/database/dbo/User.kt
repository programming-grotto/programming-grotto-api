package com.programminggrotto.backend.database.dbo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table(value = "users")
data class User(
    @Id
    val id: Int?,
    @Column(value = "firstname")
    val firstName: String,
    @Column(value = "lastname")
    val lastName: String,
    val username: String,
    val email: String,
    val created: LocalDateTime?,
)
