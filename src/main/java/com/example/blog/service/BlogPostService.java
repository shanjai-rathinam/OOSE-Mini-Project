package com.example.blog.service;

import com.example.blog.model.BlogPost;
import com.example.blog.repository.BlogPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogPostService {
    private final BlogPostRepository repository;

    public List<BlogPost> getAllPosts() {
        return repository.findAll();
    }

    public BlogPost getPostById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void seedData() {
        if (repository.count() == 0) {
            BlogPost post = new BlogPost();
            post.setTitle("Welcome to DevOps Blog Platform");
            post.setContent("This is a simple Object-Oriented blog system built for OOSE project with Docker and CI/CD pipeline.");
            repository.save(post);
        }
    }
}