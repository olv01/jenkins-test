package com.example.test.jenkins;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JenkinsTestApplicationTests {

	@DisplayName("Dummy test 1")
	@Test
	void contextLoads() {











	}

	@DisplayName("Dummy test 2")
	@Test
	void test1() {
		int num = 1;
		assertThat(num).isEqualTo(2);
	}

	@DisplayName("Dummy test 3")
	@Test
	void test2() {
		String a = "123";
		assertThat(a).isEqualTo("123");
	}

}
