package com.example.kotlinboard.entity

import jakarta.persistence.*

@Entity
@Table(name = "comments_table")
data class Comment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id")
    var cid: Content? = null,

    @Column(name = "writer")
    val writer: String,

    @Column(name = "text")
    val text: String,
)

