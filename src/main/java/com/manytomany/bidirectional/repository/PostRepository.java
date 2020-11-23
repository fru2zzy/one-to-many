package com.manytomany.bidirectional.repository;

import com.manytomany.bidirectional.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
