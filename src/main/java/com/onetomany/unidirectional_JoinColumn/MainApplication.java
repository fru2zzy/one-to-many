package com.onetomany.unidirectional_JoinColumn;

import com.onetomany.unidirectional_JoinColumn.model.Post;
import com.onetomany.unidirectional_JoinColumn.model.PostComment;
import com.onetomany.unidirectional_JoinColumn.repository.PostCommentRepository;
import com.onetomany.unidirectional_JoinColumn.repository.PostRepository;
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
        uniDirectionalOneToManyAndJoinColumn();
    }

    private void uniDirectionalOneToManyAndJoinColumn() {
        Post post = new Post("First post");
        post.getComments().add(new PostComment("one-to-many-unidirectional + JoinColumn"));
        post.getComments().add(new PostComment("My second review"));
        post.getComments().add(new PostComment("My third review"));
        postRepository.save(post);
    }
}
