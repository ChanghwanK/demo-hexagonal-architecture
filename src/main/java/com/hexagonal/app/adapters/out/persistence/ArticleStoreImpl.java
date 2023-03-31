package com.hexagonal.app.adapters.out.persistence;

import com.hexagonal.app.adapters.out.persistence.mapper.ArticlePersistenceMapper;
import com.hexagonal.app.domain.Article;
import com.hexagonal.app.application.port.out.SaveArticlePort;
import org.springframework.stereotype.Component;

@Component
public class ArticleStoreImpl implements SaveArticlePort {

    private final ArticleRepository articleRepository;
    private final ArticlePersistenceMapper articlePersistenceMapper;

    public ArticleStoreImpl(
            ArticleRepository articleRepository,
            ArticlePersistenceMapper articlePersistenceMapper) {
        this.articleRepository = articleRepository;
        this.articlePersistenceMapper = articlePersistenceMapper;
    }

    @Override
    public void saveNewArticle(Article article) {
        articleRepository.save(articlePersistenceMapper.mapToJpaEntity(article));
    }
}
