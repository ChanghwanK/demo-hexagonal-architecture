package com.hexagonal.app.domain.service;
import com.hexagonal.app.domain.ArticleStore;
import com.hexagonal.app.domain.info.ArticleRegisterCommandRes;
import com.hexagonal.app.domain.usecase.NewArticleRegisterUseCase;
import com.hexagonal.app.infrastructure.article.ArticleJpaEntity;
import org.springframework.stereotype.Service;

@Service
public class ArticleRegisterService implements NewArticleRegisterUseCase {
//    private final ArticleService articleService;
    private final ArticleStore articleCommand;

    public ArticleRegisterService(final ArticleStore articleCommand) {
        this.articleCommand = articleCommand;
    }

    @Override
    public ArticleRegisterCommandRes command(Command command) {
        ArticleJpaEntity entity = articleCommand.registerNewArticle(command.toArticle());
        return ArticleRegisterCommandRes.of(entity.getId(), entity.getTitle(), entity.getAuthor());
    }
}
