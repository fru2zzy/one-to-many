package com.manytomany.bidirectional;

import com.manytomany.bidirectional.model.Post;
import com.manytomany.bidirectional.model.PostComment;
import com.manytomany.bidirectional.repository.PostCommentRepository;
import com.manytomany.bidirectional.repository.PostRepository;
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

        PostComment postComment = new PostComment("First post comment");
        PostComment postComment2 = new PostComment("Second post comment");

        post.addToList(postComment);
        post2.addToList(postComment2);

        postComment.addToList(post);
        postComment2.addToList(post2);

        postRepository.save(post);
        postRepository.save(post2);
    }
}
