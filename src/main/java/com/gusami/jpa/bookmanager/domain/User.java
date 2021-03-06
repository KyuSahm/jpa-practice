package com.gusami.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@Table(name="user", indexes={@Index(columnList="name")}, uniqueConstraints={@UniqueConstraint(columnNames={"email"})} )
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //@OneToMany(fetch = FetchType.EAGER)
    //private List<Address> address;
}