package com.hexagonal.app.domain.info;

import com.hexagonal.app.domain.Article;

public class ArticleDetailData {

    private final String title;
    private final String author;
    private final String content;

    private ArticleDetailData(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public static ArticleDetailData of(Article article) {
        return new ArticleDetailData(article.getTitle(), article.getAuthor(), article.getContent());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
