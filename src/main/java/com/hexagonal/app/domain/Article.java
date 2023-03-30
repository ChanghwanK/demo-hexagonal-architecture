package com.hexagonal.app.domain;

import java.util.List;

public class Article {
    private final String title;
    private final String author;
    private final String content;

    public Article(String title, String author,  String content) {
        this.author = author;
        this.title = title;
        this.content = content;
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
