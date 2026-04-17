package com.example.blog.controller;

import com.example.blog.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class BlogController {

    private final BlogPostService service;

    @GetMapping("/")
    public String home(Model model) {
        service.seedData();
        model.addAttribute("posts", service.getAllPosts());
        return "home";
    }

    @GetMapping("/post/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", service.getPostById(id));
        return "post";
    }
}