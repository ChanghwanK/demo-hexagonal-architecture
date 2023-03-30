package com.hexagonal.app.domain.usecase;

import com.hexagonal.app.domain.info.ArticleDetailData;
import lombok.Getter;

public interface QueryArticleDetailDataByIdUseCase {

    ArticleDetailData query(Query query);

    @Getter
    class Query {
        long articleId;
        public Query(long articleId) {
            this.articleId = articleId;
        }
    }
}
