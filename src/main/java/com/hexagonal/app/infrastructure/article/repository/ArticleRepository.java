package com.hexagonal.app.infrastructure.article.repository;

import com.hexagonal.app.infrastructure.article.ArticleJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleJpaEntity, Long> { }
