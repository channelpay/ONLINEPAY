package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
//        HibernateJpaAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
//@EnableTransactionManagement
@SpringBootApplication
public class BookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }
}
