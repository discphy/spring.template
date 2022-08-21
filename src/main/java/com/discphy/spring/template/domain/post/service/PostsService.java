package com.discphy.spring.template.domain.post.service;

import com.discphy.spring.template.domain.post.dto.PostsDto;
import com.discphy.spring.template.domain.post.repository.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }
}
