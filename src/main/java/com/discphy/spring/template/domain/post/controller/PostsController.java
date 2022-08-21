package com.discphy.spring.template.domain.post.controller;

import com.discphy.spring.template.domain.post.dto.PostsDto;
import com.discphy.spring.template.domain.post.repository.PostsRepository;
import com.discphy.spring.template.domain.post.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostsController {
    private PostsService postsService;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsDto dto) {
        postsService.save(dto);
    }
}
