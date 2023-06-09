package com.hexagonal.app.adapters.in.web;

import com.hexagonal.app.application.port.in.NewArticleRegisterUseCase;
import com.hexagonal.app.application.port.in.QueryArticleDetailDataByIdUseCase;
import com.hexagonal.app.adapters.in.web.dto.ArticleRequestDto.RegisterArticleDto;
import com.hexagonal.app.adapters.in.web.dto.ArticleResponseDto.ArticleQueryRes;
import com.hexagonal.app.adapters.in.web.mapper.ArticleMapper;
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
    public void registerNewArticle(
            @RequestBody @Valid RegisterArticleDto registerArticleDto) {
        articleSaveUseCase.command(registerArticleDto.toCommand());
    }

    @GetMapping("/api/v1/articles/{articleId}")
    public ArticleQueryRes getArticleDetailData(
            @PathVariable final Long articleId) {
        return ArticleMapper.mapToQueryRes(queryArticleDetailDataUseCase.query(new QueryArticleDetailDataByIdUseCase.Query(articleId)));
    }
}
