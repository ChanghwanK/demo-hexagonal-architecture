package com.hexagonal.app.domain;

public interface ArticleReader {
    Article findById(Long articleId);
}
