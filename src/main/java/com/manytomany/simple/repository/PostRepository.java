package com.manytomany.simple.repository;

import com.manytomany.simple.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
