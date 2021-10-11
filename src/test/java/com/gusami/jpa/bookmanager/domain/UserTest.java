package com.gusami.jpa.bookmanager.domain;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("gusami32@fastcampus.com");
        user.setName("gusami");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        System.out.println(">>>" + user);

        User user1 = new User(null, "martin", "martin@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        System.out.println(">>>" + user1);

        User user2 = new User("busi", "busi@gamil.com");
        System.out.println(">>>" + user2);

        User user3 = User.builder()
                .name("daehyeon")
                .email("gusami32jr@gmail.com")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        System.out.println(">>>" + user3);
    }
}