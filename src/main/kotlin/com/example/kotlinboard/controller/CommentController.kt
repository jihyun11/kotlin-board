package com.example.kotlinboard.controller

import com.example.kotlinboard.entity.Comment
import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.service.CommentService
import com.example.kotlinboard.service.ContentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class CommentController(
    private val commentService: CommentService,
    private val contentService: ContentService
) {
    @PostMapping("/comment")
    fun saveComment(@RequestParam contentId: Long,
                    @RequestParam writer: String,
                    @RequestParam text: String): ResponseEntity<Comment> {
        val comment = commentService.saveComment(contentId, writer, text)
        return ResponseEntity.ok(comment)
    }

    @GetMapping("/comment")
    fun selectComment(@RequestParam commentId: Long): ResponseEntity<Comment> {
        val comment = commentService.findComment(commentId)
        return ResponseEntity.ok(comment)
    }

    @GetMapping("/content/file")
    fun findContentList(@RequestParam contentId: Long) {
        contentService.findContent(contentId)
    }
}