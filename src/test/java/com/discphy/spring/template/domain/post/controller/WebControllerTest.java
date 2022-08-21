package com.discphy.spring.template.domain.post.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class WebControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void 메인페이지_로딩() {
        //when
        String body = this.testRestTemplate.getForObject("/", String.class);

        //then
        System.out.println(body);
        assertTrue(body.contains("스프링부트"));
    }
}