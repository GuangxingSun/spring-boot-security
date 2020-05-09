package com.guangxing.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、引入SpringSecurity;
 * 2、编写SpringSecurity配置类
 *      @EnableWebSecurity   配置类必须继承WebSecurityConfigurerAdapter
 * 3、控制请求的访问权限
 */
@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

}
