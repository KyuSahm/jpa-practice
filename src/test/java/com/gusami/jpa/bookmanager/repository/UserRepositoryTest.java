package com.gusami.jpa.bookmanager.repository;

import com.gusami.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() {
        //userRepository.save(new User("david", "david@fastcampus.com"));

        User user = userRepository.findById(1L).orElseThrow();
        user.setEmail("martin-update@fastcampus.com");
        userRepository.save(user);

        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }

    @Test
    void select() {
        System.out.println("findByEmail" + userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println("getByEmail" + userRepository.getByEmail("martin@fastcampus.com"));
        System.out.println("readByEmail" + userRepository.readByEmail("martin@fastcampus.com"));
        System.out.println("queryByEmail" + userRepository.queryByEmail("martin@fastcampus.com"));
        System.out.println("searchByEmail" + userRepository.searchByEmail("martin@fastcampus.com"));
        System.out.println("streamByEmail" + userRepository.streamByEmail("martin@fastcampus.com"));
        System.out.println("findUserByEmail" + userRepository.findUserByEmail("martin@fastcampus.com"));
        System.out.println("findSomethingByEmail" + userRepository.findSomethingByEmail("martin@fastcampus.com"));
        System.out.println("findFirst2ByName" + userRepository.findFirst2ByName("martin"));
        System.out.println("findTop2ByName" + userRepository.findTop2ByName("martin"));
    }
}