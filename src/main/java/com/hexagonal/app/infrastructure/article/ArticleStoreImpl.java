package com.hexagonal.app.infrastructure.article;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.domain.ArticleStore;
import com.hexagonal.app.infrastructure.article.repository.ArticleRepository;
import org.springframework.stereotype.Component;

@Component
public class ArticleStoreImpl implements ArticleStore {

    private final ArticleRepository articleRepository;

    public ArticleStoreImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleJpaEntity registerNewArticle(Article article) {
        ArticleJpaEntity articleJpaEntity = ArticleJpaEntity.newArticle(article.getTitle(), article.getAuthor(), article.getContent());
        return articleRepository.save(articleJpaEntity);
    }
}
