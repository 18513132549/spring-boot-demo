package com.ermao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.ermao")
@EnableJpaRepositories(basePackages = "com.ermao")
@EntityScan("com.ermao")
public class DemoJonesApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoJonesApplication.class, args);
  }
}
