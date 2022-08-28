package com.discphy.spring.template.domain.post.service;

import com.discphy.spring.template.domain.post.dto.PostsDto;
import com.discphy.spring.template.domain.post.dto.PostsMainResponseDto;
import com.discphy.spring.template.domain.post.repository.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class PostsService {
    @Autowired
    private PostsRepository postsRepository;
    @Transactional
    public Long save(PostsDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
