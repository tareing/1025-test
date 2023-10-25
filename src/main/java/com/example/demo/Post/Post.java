package com.example.demo.Post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
    private LocalDateTime CreateDate;

}