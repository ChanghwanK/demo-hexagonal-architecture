package com.hexagonal.app.application.service;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.application.port.out.LoadArticlePort;
import com.hexagonal.app.application.info.ArticleDetailData;
import com.hexagonal.app.application.port.in.QueryArticleDetailDataByIdUseCase;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class QueryArticleDetailById implements QueryArticleDetailDataByIdUseCase {

    public final LoadArticlePort reader;

    public QueryArticleDetailById(LoadArticlePort reader) {
        this.reader = reader;
    }

    @Override
    public ArticleDetailData query(Query query) {
        Article article = reader.findById(query.getArticleId());
        return ArticleDetailData.of(article);
    }
}
