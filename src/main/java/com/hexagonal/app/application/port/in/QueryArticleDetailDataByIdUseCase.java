package com.hexagonal.app.application.port.in;

import com.hexagonal.app.application.info.ArticleDetailData;
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
