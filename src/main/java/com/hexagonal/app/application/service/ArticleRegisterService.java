package com.hexagonal.app.application.service;
import com.hexagonal.app.application.port.out.SaveArticlePort;
import com.hexagonal.app.application.port.in.NewArticleRegisterUseCase;
import org.springframework.stereotype.Service;

@Service
public class ArticleRegisterService implements NewArticleRegisterUseCase {
    private final SaveArticlePort saveArticlePort;

    public ArticleRegisterService(final SaveArticlePort articleCommand) {
        this.saveArticlePort = articleCommand;
    }

    @Override
    public void command(Command command) {
        saveArticlePort.saveNewArticle(command.toArticle());
    }
}
