package com.hexagonal.app.adapters.out.persistence;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.application.port.out.LoadArticlePort;
import com.hexagonal.app.adapters.out.persistence.mapper.ArticlePersistenceMapper;
import org.springframework.stereotype.Component;

@Component
public class ArticleReaderImpl implements LoadArticlePort {

    private final ArticleRepository articleRepository;
    private final ArticlePersistenceMapper articleMapper;

    public ArticleReaderImpl(ArticleRepository articleRepository, ArticlePersistenceMapper articleMapper) {
        this.articleRepository = articleRepository;
        this.articleMapper = articleMapper;
    }

    @Override
    public Article findById(Long articleId) {
         ArticleJpaEntity entity = articleRepository.findById(articleId)
            .orElseThrow(IllegalArgumentException::new);
        return articleMapper.mapToDomainEntity(entity);
    }
}
