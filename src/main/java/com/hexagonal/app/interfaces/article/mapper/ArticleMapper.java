package com.hexagonal.app.interfaces.article.mapper;

import com.hexagonal.app.domain.info.ArticleDetailData;
import com.hexagonal.app.domain.info.ArticleRegisterCommandRes;
import com.hexagonal.app.interfaces.article.dto.ArticleResponseDto;
import com.hexagonal.app.interfaces.article.dto.ArticleResponseDto.ArticleQueryRes;

public class ArticleMapper {

    public static ArticleResponseDto.RegisterRes mapToRegistRes(
        final ArticleRegisterCommandRes articleRegisterCommandRes
    ) {
        return new ArticleResponseDto.RegisterRes(
            articleRegisterCommandRes.getArticleId(),
            articleRegisterCommandRes.getAuthor(),
            articleRegisterCommandRes.getTitle()
        );
    }

    public static ArticleQueryRes mapToQueryRes(ArticleDetailData articleDetailData) {
        return new ArticleQueryRes(
            articleDetailData.getTitle(),
            articleDetailData.getAuthor(),
            articleDetailData.getContent()
        );
    }
}
