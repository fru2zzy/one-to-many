package com.onetomany.unidirectional_JoinColumn.repository;

import com.onetomany.unidirectional_JoinColumn.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
