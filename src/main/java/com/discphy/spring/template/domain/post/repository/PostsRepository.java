package com.discphy.spring.template.domain.post.repository;

import com.discphy.spring.template.domain.post.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();
}
