package com.hexagonal.app.infrastructure.article.mapper;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.infrastructure.article.ArticleJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

    public Article mapToDomainEntity(ArticleJpaEntity entity) {
        return new Article(entity.getTitle(), entity.getAuthor(), entity.getContent());
    }
}
