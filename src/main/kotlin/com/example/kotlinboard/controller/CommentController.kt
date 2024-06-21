package com.example.kotlinboard.controller

import com.example.kotlinboard.entity.Comment
import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.service.CommentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController(
    private val commentService: CommentService
) {

    @PostMapping("/comment")
    fun saveComment(@RequestParam commentId: Content,
                    @RequestParam writer: String,
                    @RequestParam text: String): ResponseEntity<Comment> {
        val comment = commentService.saveComment(commentId, writer, text)
        return ResponseEntity.ok(comment)
    }
}