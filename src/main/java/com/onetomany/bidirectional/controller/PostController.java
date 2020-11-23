package com.onetomany.bidirectional.controller;


import java.util.Collections;

import com.onetomany.bidirectional.model.Post;
import com.onetomany.bidirectional.model.PostComment;
import com.onetomany.bidirectional.repository.PostCommentRepository;
import com.onetomany.bidirectional.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostCommentRepository postCommentRepository;

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @PostMapping("/postComment")
    public PostComment createPostComment(@RequestBody PostComment postComment) {
        return postCommentRepository.save(postComment);
    }

    @GetMapping("/addPostToPostComment/{postId}/{commentId}")
    public PostComment addPostToPostComment(@PathVariable Long postId, @PathVariable Long commentId) {
        Post post = postRepository.getOne(postId);
        PostComment postComment = postCommentRepository.getOne(commentId);
        postComment.setPost(post);
        return postCommentRepository.save(postComment);
    }

    @GetMapping("/addPostCommentToPost/{postId}/{commentId}")
    public Post addPostCommentToPost(@PathVariable Long postId, @PathVariable Long commentId) {
        PostComment postComment = postCommentRepository.getOne(commentId);
        Post post = postRepository.getOne(postId);
        post.addCommentToList(postComment);
        return postRepository.save(post);
    }
}
