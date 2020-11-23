package com.onetomany.unidirectional.repository;

import com.onetomany.unidirectional.model.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
