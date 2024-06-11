package com.example.kotlinboard.service

import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.repository.ContentRepository
import org.springframework.stereotype.Service

@Service
class ContentService(private val contentRepository: ContentRepository) {
    fun saveCount(content: Content): Content {
        return contentRepository.save(content)
    }

    fun getAllContents(): List<Content> {
        return contentRepository.findAll()
    }

    fun deleteContents(id: Long) {
        return contentRepository.deleteById(id)
    }
}