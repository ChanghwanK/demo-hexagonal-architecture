package com.hexagonal.app.domain.info;

/**
 * Domain Layer에서 Controller로 전달하기위한 VO 입니다.
 */
public class ArticleRegisterCommandRes {
    private final Long articleId;
    private final String title;
    private final String author;


    private ArticleRegisterCommandRes(Long articleId, String title, String author) {
        this.articleId = articleId;
        this.title = title;
        this.author = author;
    }

    public static ArticleRegisterCommandRes of(Long articleId, String title, String author) {
        return new ArticleRegisterCommandRes(articleId, title, author);
    }

    public Long getArticleId() {
        return articleId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
