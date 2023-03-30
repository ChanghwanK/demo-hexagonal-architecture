package com.hexagonal.app.interfaces.article;

import com.hexagonal.app.domain.usecase.NewArticleRegisterUseCase;
import com.hexagonal.app.domain.usecase.QueryArticleDetailDataByIdUseCase;
import com.hexagonal.app.interfaces.article.dto.ArticleRequestDto.RegisterArticleDto;
import com.hexagonal.app.interfaces.article.dto.ArticleResponseDto.ArticleQueryRes;
import com.hexagonal.app.interfaces.article.dto.ArticleResponseDto.RegisterRes;
import com.hexagonal.app.interfaces.article.mapper.ArticleMapper;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ArticleRestController {

    private final NewArticleRegisterUseCase articleSaveUseCase;
    private final QueryArticleDetailDataByIdUseCase queryArticleDetailDataUseCase;

    @PostMapping("/api/v1/articles")
    public RegisterRes registerNewArticle(
        @RequestBody @Valid RegisterArticleDto registerArticleDto
    ) {
        return ArticleMapper.mapToRegistRes(articleSaveUseCase.command(registerArticleDto.toCommand()));
    }

    @GetMapping("/api/v1/articles/{articleId}")
    public ArticleQueryRes getArticleDetailData(
        @PathVariable final Long articleId
    ) {
        return ArticleMapper.mapToQueryRes(queryArticleDetailDataUseCase.query(new QueryArticleDetailDataByIdUseCase.Query(articleId)));
    }
}
