package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
}