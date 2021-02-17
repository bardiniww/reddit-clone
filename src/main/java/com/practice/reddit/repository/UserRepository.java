package com.practice.reddit.repository;

import com.practice.reddit.model.Subreddit;
import com.practice.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
