package com.discphy.spring.template.domain.post.repository;

import com.discphy.spring.template.domain.post.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
