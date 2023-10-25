package com.example.demo;

import com.example.demo.Post.Post;
import com.example.demo.Post.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private PostRepository postRepository;

	@Test
	void contextLoads() {

		Post q1 = new Post();
		q1.setTitle("aaa");
		q1.setContent("");
		q1.setCreateDate(LocalDateTime.now());
		this.postRepository.save(q1);

	}

}
