package com.discphy.openkakao.domain.post.repository;

import com.discphy.openkakao.domain.post.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
