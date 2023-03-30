package com.hexagonal.app.interfaces.article.mapper;

import com.hexagonal.app.domain.info.ArticleRegisterCommandRes;
import com.hexagonal.app.interfaces.article.dto.ArticleResponseDto;

public class ArticleMapper {

    public static ArticleResponseDto.RegisterRes toResponse(
        final ArticleRegisterCommandRes articleRegisterCommandRes
    ) {
        return new ArticleResponseDto.RegisterRes(
            articleRegisterCommandRes.getArticleId(),
            articleRegisterCommandRes.getAuthor(),
            articleRegisterCommandRes.getTitle()
        );
    }

}
