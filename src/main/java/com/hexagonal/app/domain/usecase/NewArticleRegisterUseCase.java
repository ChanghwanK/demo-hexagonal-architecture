package com.hexagonal.app.domain.usecase;

import com.hexagonal.app.domain.Article;
import com.hexagonal.app.domain.info.ArticleRegisterCommandRes;
import org.apache.commons.lang3.StringUtils;

/**
 * Interface 명으로 의도를 충분히 들어내기 때문에 메서드까지 자세히 적을 필요는 없다고봄
 */
public interface NewArticleRegisterUseCase {

    ArticleRegisterCommandRes command(Command command);
    /**
     * 해당 클래스는 NewArticleRegisterUseCase에 종속되기 때문에 Interface의 중첩 클래스로 정의했습니다.
     *
     * 네, AcceptInvitationUseCase 인터페이스의 목적이 Command 객체를 통해 요청을 처리하는 것이라면,
     * Command 클래스가 인터페이스에 중첩된 것은 괜찮습니다. 이는 Command 클래스가 AcceptInvitationUseCase 인터페이스에 종속되어 있으므로 의존성을 덜어낼 수 있고,
     * AcceptInvitationUseCase와 관련된 요청을 처리하는 데 필요한 데이터와 동작을 캡슐화할 수 있습니다. 이는 코드의 가독성과 유지보수성을 높일 수 있습니다.
     */
    class Command {
        private final String title;
        private final String author;
        private final String content;

        public Command(final String author, final String title, final String content) {
            validateConstructorParameter(author, title, content);
            this.author = author;
            this.title = title;
            this.content = content;
        }

        public Article toArticle() {
            return new Article(author, title, content);
        }
        public void validateConstructorParameter(String author, String title, String content) {
            if(StringUtils.isBlank(author))
                throw new IllegalArgumentException();

            if(StringUtils.isBlank(title))
                throw new IllegalArgumentException();

            if(StringUtils.isBlank(content))
                throw new IllegalArgumentException();
        }
    }
}
