package com.discphy.spring.template.domain.post.service;

import com.discphy.spring.template.domain.post.dto.PostsDto;
import com.discphy.spring.template.domain.post.entity.Posts;
import com.discphy.spring.template.domain.post.repository.PostsRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class PostsServiceTest {
    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        postsRepository.deleteAll();
    }

    @Test
    void DTO_table_save() {
        //given
        PostsDto postsDto = PostsDto.builder()
                .title("테스트 타이틀")
                .content("test content")
                .author("discphy")
                .build();

        //when
        postsService.save(postsDto);

        //then
        Posts posts = postsRepository.findAll().get(0);

        assertThat(posts.getTitle(), is(postsDto.getTitle()));
        assertThat(posts.getContent(), is(postsDto.getContent()));
        assertThat(posts.getAuthor(), is(postsDto.getAuthor()));

    }
}