package com.hexagonal.app.application.port.out;

import com.hexagonal.app.domain.Article;

public interface LoadArticlePort {
    Article findById(Long articleId);
}
