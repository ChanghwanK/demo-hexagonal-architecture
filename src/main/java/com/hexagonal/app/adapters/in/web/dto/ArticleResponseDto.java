package com.hexagonal.app.adapters.in.web.dto;

import lombok.Getter;

public class ArticleResponseDto {
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
