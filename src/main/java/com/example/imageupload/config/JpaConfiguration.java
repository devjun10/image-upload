package com.example.imageupload.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@EnableJpaAuditing
@Configuration
public class JpaConfiguration {

    @PersistenceContext
    private EntityManager entityManager;
}
