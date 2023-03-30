package com.hexagonal.app.infrastructure.article;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class ArticleJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String content;

    protected ArticleJpaEntity() {
    }

    public ArticleJpaEntity(final String title, final String author, final String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    /**
     * DTO or Command 자체를 Parameter로 하는 것보다 변수들을 받을 경우 어떠한 값들이 필요한지 조금더 명시적이라고 생각함
     */
    public static ArticleJpaEntity newArticle(final String title, final String author, final String content) {
        return new ArticleJpaEntity(title, author, content);
    }

    public Long getId() {
        return id;
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
