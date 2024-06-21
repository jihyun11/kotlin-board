package com.example.kotlinboard.service

import com.example.kotlinboard.entity.Comment
import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.repository.CommentRepository
import com.example.kotlinboard.repository.ContentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommentService(
    private val commentRepository: CommentRepository,
    private val contentRepository: ContentRepository
) {

    fun saveComment(contentId: Content, writer: String, text: String): Comment {
        val comment = Comment(
            cid = contentId,
            writer = writer,
            text = text
        )
        return commentRepository.save(comment)
    }
}