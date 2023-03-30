package com.hexagonal.app.interfaces.article;

import com.hexagonal.app.domain.usecase.NewArticleRegisterUseCase;
import com.hexagonal.app.interfaces.article.dto.ArticleRequestDto.RegisterArticleDto;
import com.hexagonal.app.interfaces.article.dto.ArticleResponseDto.RegisterRes;
import com.hexagonal.app.interfaces.article.mapper.ArticleMapper;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ArticleRestController {

    private final NewArticleRegisterUseCase articleSaveUseCase;

    @PostMapping("/api/v1/articles")
    public RegisterRes registerNewArticle(
        @RequestBody @Valid RegisterArticleDto registerArticleDto
    ) {
        return ArticleMapper.toResponse(articleSaveUseCase.command(registerArticleDto.toCommand()));
    }
}
