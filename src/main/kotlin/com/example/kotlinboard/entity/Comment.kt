package com.example.kotlinboard.entity

import jakarta.persistence.*

@Entity
@Table(name = "comments_table")
data class Comment(
    @Id
    @Column(name = "comment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val commentId: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id")
    var content: Content,

    @Column(name = "writer")
    val writer: String,

    @Column(name = "text")
    val text: String,
)

