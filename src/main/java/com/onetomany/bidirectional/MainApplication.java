package com.onetomany.bidirectional;

import com.onetomany.bidirectional.model.Post;
import com.onetomany.bidirectional.repository.PostCommentRepository;
import com.onetomany.bidirectional.repository.PostRepository;
import com.onetomany.bidirectional.model.PostComment;
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
        //biDirectionalOneToMany();
    }

    private void biDirectionalOneToMany() {
        Post post = new Post("First post");
//        postRepository.save(post);
        Post postFromDB = postRepository.getOne(1L);
        PostComment postComment = new PostComment("Bi directional one-to-many1");
        PostComment postComment2 = new PostComment("Bi directional one-to-many2");
        postComment.setPost(postFromDB);
        postComment2.setPost(postFromDB);
//        postCommentRepository.save(postComment);
//        postCommentRepository.save(postComment2);

//        post.addCommentToList(postComment);
//        post.addCommentToList(postComment2);
//        postRepository.save(post);
        postCommentRepository.save(postComment);
    }
}
