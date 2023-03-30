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

}
