package com.example.kotlinboard.entity

import jakarta.persistence.*
import java.util.Collections.emptyList


@Entity
@Table(name = "contents_table")
data class Content(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "text")
    val text: String,

//    @OneToMany(mappedBy = "content", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
//    val comments: MutableList<Comment>? = null
)
