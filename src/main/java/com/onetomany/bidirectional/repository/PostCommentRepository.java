package com.onetomany.bidirectional.repository;

import com.onetomany.bidirectional.model.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
