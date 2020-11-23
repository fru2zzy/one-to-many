package com.onetomany.bidirectional.repository;

import com.onetomany.bidirectional.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
