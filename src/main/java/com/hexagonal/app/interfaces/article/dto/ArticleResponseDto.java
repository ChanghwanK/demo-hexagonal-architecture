package com.hexagonal.app.interfaces.article.dto;

import lombok.Getter;

public class ArticleResponseDto {

    @Getter
    public static class RegisterRes {
        private final Long articleId;
        private final String title;
        private final String author;

        public RegisterRes(final Long articleId, final String title, final String author) {
            this.articleId = articleId;
            this.title = title;
            this.author = author;
        }
    }

    @Getter
    public static class ArticleQueryRes {
        private final String title;
        private final String author;
        private final String content;

        public ArticleQueryRes(String title, String author, String content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }
    }

}
