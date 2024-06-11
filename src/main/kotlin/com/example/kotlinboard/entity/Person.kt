package com.example.kotlinboard.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

@Entity
@Table(name = "JPA_PERSON")
data class Person @JsonCreator constructor(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("birthYear")
    val birthYear: Int
)