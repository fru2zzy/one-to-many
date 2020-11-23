package com.onetomany.unidirectional_JoinColumn.repository;

import com.onetomany.unidirectional_JoinColumn.model.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
