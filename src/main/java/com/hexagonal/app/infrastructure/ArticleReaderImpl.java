package com.hexagonal.app.infrastructure;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.domain.ArticleReader;
import com.hexagonal.app.infrastructure.article.ArticleJpaEntity;
import com.hexagonal.app.infrastructure.article.mapper.ArticleMapper;
import com.hexagonal.app.infrastructure.article.repository.ArticleRepository;
import org.springframework.stereotype.Component;

@Component
public class ArticleReaderImpl implements ArticleReader {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    public ArticleReaderImpl(ArticleRepository articleRepository, ArticleMapper articleMapper) {
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
