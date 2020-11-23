package com.manytomany.simple;

import com.manytomany.simple.model.Post;
import com.manytomany.simple.model.PostComment;
import com.manytomany.simple.repository.PostCommentRepository;
import com.manytomany.simple.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostCommentRepository postCommentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) {
        uniDirectionalOneToMany();
    }

    private void uniDirectionalOneToMany() {
        Post post = new Post("First post");
        Post post2 = new Post("Second post");

//        Post post = postRepository.findById(1L).get();
//        Post post2 = postRepository.findById(2L).get();

        PostComment postComment = new PostComment("First post comment");
        PostComment postComment2 = new PostComment("Second post comment");

//        postCommentRepository.save(postComment);
//        postCommentRepository.save(postComment2);

//        post.addToList(postCommentRepository.findById(1L).get());
//        post.addToList(postCommentRepository.findById(11L).get());
//        post.addToList(postComment);
//        post2.addToList(postComment2);

        postComment.addToList(post);
        postComment2.addToList(post2);

        postCommentRepository.save(postComment);
        postCommentRepository.save(postComment2);
//        postRepository.save(post);
//        postRepository.save(post2);
    }
}
