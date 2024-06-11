package com.example.kotlinboard.controller

import com.example.kotlinboard.entity.Person
import com.example.kotlinboard.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(private val personRepository: PersonRepository) {

    @GetMapping("/person")
    fun getAllPersons(): List<Person> {
        return personRepository.findAll()
    }

    @PostMapping("/person")
    fun addPerson(@RequestBody person: Person): Person {
        return personRepository.save(person)
    }
}