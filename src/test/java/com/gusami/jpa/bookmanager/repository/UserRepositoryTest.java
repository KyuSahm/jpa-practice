package com.gusami.jpa.bookmanager.repository;

import com.gusami.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
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
        System.out.println("findByEmailAndName" + userRepository.findByEmailAndName("martin@fastcampus.com", "martin"));
        System.out.println("findByEmailOrName" + userRepository.findByEmailOrName("martin@fastcampus.com","dennis"));

        System.out.println("findByCreatedAtAfter" + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1)));
        System.out.println("findByIdAfter" + userRepository.findByIdAfter(4L));
        System.out.println("findByCreatedAtGreaterThan" + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1)));
        System.out.println("findByCreatedAtGreaterThanEqual" + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1)));
        System.out.println("findByCreatedAtBetween" + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1)));
        System.out.println("findByIdBetween" + userRepository.findByIdBetween(1L, 3L));
        System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual" + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));
        System.out.println("findByIdIsNotNull" + userRepository.findByIdIsNotNull());
        //System.out.println("findByAddressIsNotEmpty" + userRepository.findByAddressIsNotEmpty());
        System.out.println("findByNameIn" + userRepository.findByNameIn(Arrays.asList("martin", "dennis")));
        System.out.println("findByNameStartingWith" + userRepository.findByNameStartingWith("mar"));
        System.out.println("findByNameEndingWith" + userRepository.findByNameEndingWith("tin"));
        System.out.println("findByNameContains" + userRepository.findByNameContains("art"));
        System.out.println("findByNameLike" + userRepository.findByNameLike("mar%"));
        System.out.println("findByNameLike" + userRepository.findByNameLike("%tin"));
        System.out.println("findByNameLike" + userRepository.findByNameLike("%art%"));
        System.out.println("findByNameIs" + userRepository.findByNameIs("martin"));
        System.out.println("findByNameEquals" + userRepository.findByNameEquals("martin"));
        System.out.println("findByName" + userRepository.findByName("martin"));
    }
}