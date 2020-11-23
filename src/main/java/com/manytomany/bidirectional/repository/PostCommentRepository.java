package com.manytomany.bidirectional.repository;

import com.manytomany.bidirectional.model.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
