package com.idwxy.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 添加 @MapperScan 注解，在 Spring Boot 启动的时候自动加载包路径下的 Mapper 接口
@SpringBootApplication
@MapperScan("com.idwxy.blog.dao")
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
