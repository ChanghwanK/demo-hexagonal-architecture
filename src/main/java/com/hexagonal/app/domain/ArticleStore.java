package com.hexagonal.app.domain;

import com.hexagonal.app.infrastructure.article.ArticleJpaEntity;

public interface ArticleStore {
    ArticleJpaEntity registerNewArticle(Article article);
}
