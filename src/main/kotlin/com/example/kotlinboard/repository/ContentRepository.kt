package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Content
import org.springframework.data.jpa.repository.JpaRepository

interface ContentRepository: JpaRepository<Content, Long> {
}