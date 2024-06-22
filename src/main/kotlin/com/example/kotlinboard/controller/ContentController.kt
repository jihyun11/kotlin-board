package com.example.kotlinboard.controller

import com.example.kotlinboard.entity.Content
import com.example.kotlinboard.service.ContentService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class ContentController(private val contentService: ContentService) {


    @GetMapping("/content")
    fun index(model: Model): String {
        model.addAttribute("contents", contentService.getAllContents())
        return "content"
    }

    @PostMapping("/content")
    fun saveCount(@ModelAttribute text: Content): String {
        contentService.saveCount(text)
        return "redirect:/content"
    }

    @PostMapping("/delete")
    fun deleteContents(@RequestParam id: Long): String {
        contentService.deleteContents(id)
        return "redirect:/content"
    }

    @GetMapping("/update/{idValue}")
    fun updateView(@PathVariable("idValue") idValue: Long, model: Model): String {
        var content = contentService.updateView(idValue)
        model.addAttribute("content", content)
        return "update"
    }

    @PostMapping("/update")
    fun updateContents(@RequestParam id: Long, @RequestParam text: String): String {
        contentService.updateContents(id, text)
        return "redirect:/content"
    }




}