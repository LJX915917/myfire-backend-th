package com.studygroup.myfire.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.studygroup.myfire")
public class MyFireBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFireBackendApplication.class);
    }

}
