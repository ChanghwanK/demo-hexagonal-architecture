package com.hexagonal.app.adapters.in.web.mapper;

import com.hexagonal.app.application.info.ArticleDetailData;
import com.hexagonal.app.adapters.in.web.dto.ArticleResponseDto.ArticleQueryRes;

public class ArticleMapper {
    public static ArticleQueryRes mapToQueryRes(ArticleDetailData articleDetailData) {
        return new ArticleQueryRes(
            articleDetailData.getTitle(),
            articleDetailData.getAuthor(),
            articleDetailData.getContent()
        );
    }
}
