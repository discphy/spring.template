package com.discphy.spring.template.domain.post.repository;

import com.discphy.spring.template.domain.post.entity.Posts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        postsRepository.deleteAll();
    }

    @Test
    void post_save_load() {
        //given
        postsRepository.save(Posts.builder().title("테스트 제목").content("테스트 내용").author("discphy").build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("테스트 제목"));
        assertThat(posts.getContent(), is("테스트 내용"));
    }

    @Test
    void time_register() {
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Posts.builder()
                        .title("테스트 타이틀")
                        .content("테스트 콘텐츠")
                        .author("테스트 작성자")
                        .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertTrue(posts.getCreateDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}