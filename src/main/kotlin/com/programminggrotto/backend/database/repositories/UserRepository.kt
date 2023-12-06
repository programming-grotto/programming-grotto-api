package com.programminggrotto.backend.database.repositories

import com.programminggrotto.backend.database.dbo.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CoroutineCrudRepository<User, Int> {
}
