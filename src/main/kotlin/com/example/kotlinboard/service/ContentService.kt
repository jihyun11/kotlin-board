package com.example.kotlinboard.service

import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.repository.ContentRepository
import org.springframework.stereotype.Service
import java.util.*

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

    fun updateView(id: Long): Content {
        return contentRepository.findById(id).orElseThrow { NoSuchElementException("Content not found") }
    }

//    위쪽 updateVie함수도 아래쪽 updateContents함수의 val content처럼 id 하나만 매개변수로 받아서 쉽게 쓰고 싶은데 불가능?

    fun updateContents(id: Long, newText: String): Content {
        val content = Content(id, newText)
        return contentRepository.save(content)
    }
}