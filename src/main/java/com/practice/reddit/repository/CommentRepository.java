package com.practice.reddit.repository;

import com.practice.reddit.model.Comment;
import com.practice.reddit.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
