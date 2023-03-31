package com.hexagonal.app.adapters.out.persistence.mapper;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.adapters.out.persistence.ArticleJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ArticlePersistenceMapper {

    public Article mapToDomainEntity(ArticleJpaEntity entity) {
        return new Article(entity.getTitle(), entity.getAuthor(), entity.getContent());
    }

    public ArticleJpaEntity mapToJpaEntity(Article article) {
        return new ArticleJpaEntity(article.getTitle(), article.getAuthor(), article.getTitle());
    }
}
