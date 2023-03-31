package com.hexagonal.app.adapters.in.web.dto;

import com.hexagonal.app.application.port.in.NewArticleRegisterUseCase;
import javax.validation.constraints.NotBlank;
import lombok.Getter;

public class ArticleRequestDto {

    @Getter
    public static class RegisterArticleDto {
        @NotBlank
        private final String author;

        @NotBlank
        private final String title;

        @NotBlank
        private final String content;

        public RegisterArticleDto(String author, String title, String content) {
            this.author = author;
            this.title = title;
            this.content = content;
        }

        public NewArticleRegisterUseCase.Command toCommand() {
            return new NewArticleRegisterUseCase.Command(author, title, content);
        }
    }

}
