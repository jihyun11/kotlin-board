package com.example.kotlinboard.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table


@Entity
@Table(name = "contents_table")
data class Content(

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val text: String
        )
