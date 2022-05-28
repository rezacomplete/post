package com.jobclubofficial.post.controller;

import com.jobclubofficial.post.entity.Post;
import com.jobclubofficial.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/users/{username}/posts")
    public List<Post> getPosts(@PathVariable String username) {
        return postService.getPosts(username);
    }
}
