package com.hexagonal.app.domain.service;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.domain.ArticleReader;
import com.hexagonal.app.domain.info.ArticleDetailData;
import com.hexagonal.app.domain.usecase.QueryArticleDetailDataByIdUseCase;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class QueryArticleDetailById implements QueryArticleDetailDataByIdUseCase {

    public final ArticleReader reader;

    public QueryArticleDetailById(ArticleReader reader) {
        this.reader = reader;
    }

    @Override
    public ArticleDetailData query(Query query) {
        Article article = reader.findById(query.getArticleId());
        return ArticleDetailData.of(article);
    }
}
