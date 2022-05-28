package com.jobclubofficial.post.service;

import com.jobclubofficial.post.entity.Post;
import com.jobclubofficial.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts(String username) {
        return postRepository.findPostsByUsername(username.toLowerCase());
    }
}
