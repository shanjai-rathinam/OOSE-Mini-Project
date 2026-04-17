package com.example.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Comment extends BaseEntity {
    @Column(columnDefinition = "TEXT")
    private String content;
    private String authorName = "Guest";

    @ManyToOne
    @JoinColumn(name = "post_id")
    private BlogPost post;
}