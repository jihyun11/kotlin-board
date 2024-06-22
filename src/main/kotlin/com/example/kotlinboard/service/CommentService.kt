package com.example.kotlinboard.service

import com.example.kotlinboard.entity.Comment
import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.repository.CommentRepository
import com.example.kotlinboard.repository.ContentRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommentService(
    private val commentRepository: CommentRepository,
    private val contentRepository: ContentRepository
) {
    fun saveComment(contentId: Long, writer: String, text: String): Comment {
        val content = contentRepository.findById(contentId).get()
        val comment = Comment(
            content = content,
            writer = writer,
            text = text
        )
        return commentRepository.save(comment)
    }

    @Transactional
    fun findComment(commentId: Long): Comment {
        val findById = commentRepository.findById(commentId).get()
        findById.content
        return findById
    }
}