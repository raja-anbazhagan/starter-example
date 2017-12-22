package com.springhow.starterexample;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterExampleApplication {

  Logger logger = LoggerFactory.getLogger(StarterExampleApplication.class);

  @Autowired
  DataSource dataSource;

  @Bean
  String checkDatabase() throws SQLException {
    String s = dataSource.getConnection().toString();
    logger.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    logger.info("Connection name is {}", s);
    logger.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    return s;
  }

  public static void main(String[] args) {
    SpringApplication.run(StarterExampleApplication.class, args);
  }
}
