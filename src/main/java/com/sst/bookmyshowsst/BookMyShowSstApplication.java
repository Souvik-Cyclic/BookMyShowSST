package com.sst.bookmyshowsst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowSstApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowSstApplication.class, args);
    }

}

/*
Steps to automatically add createdAt & lastModifiedAt columns. (Auditing Attributes)
1. Enable JPA Auditing on Spring Boot Application.
2. @EntityListeners(AuditingEventListener.class) on BaseModel class.
3. Use @CreatedAt, @LastModifiedAt annotation on the respective attributes.
 */