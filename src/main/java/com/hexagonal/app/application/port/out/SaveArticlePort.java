package com.hexagonal.app.application.port.out;

import com.hexagonal.app.adapters.out.persistence.ArticleJpaEntity;
import com.hexagonal.app.domain.Article;

public interface SaveArticlePort {
    void saveNewArticle(Article article);
}
