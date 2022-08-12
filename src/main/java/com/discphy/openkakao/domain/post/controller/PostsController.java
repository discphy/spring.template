package com.discphy.openkakao.domain.post.controller;

import com.discphy.openkakao.domain.post.dto.PostsDto;
import com.discphy.openkakao.domain.post.repository.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostsController {
    private PostsRepository postsRepository;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsDto dto) {
        postsRepository.save(dto.toEntity());
    }
}
