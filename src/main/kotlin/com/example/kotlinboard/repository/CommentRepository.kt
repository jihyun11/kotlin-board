package com.example.kotlinboard.repository

import com.example.kotlinboard.entity.Comment
import com.example.kotlinboard.entity.Content
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository: JpaRepository<Comment, Long> {
}