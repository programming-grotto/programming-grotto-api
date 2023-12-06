package com.programminggrotto.backend.controllers

import com.programminggrotto.backend.database.dbo.User
import com.programminggrotto.backend.database.repositories.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserController(
    private val userRepository: UserRepository,
) {
    @GetMapping("/{id}")
    suspend fun findOne(@PathVariable id: Int): User? {
        return userRepository.findById(id)
    }

    @PostMapping()
    suspend fun createUser(@RequestBody user: User): User {
        return userRepository.save(user)
    }
}
