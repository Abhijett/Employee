package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan(basePackages = "com.example.demo.entity")
class CrudJpaJunitTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}