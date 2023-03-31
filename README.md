## Challenge
1. DIP를 통해 변경에 유연하게 작성
2. 나만의 Best Practice 구축
3. 고민 타파

## 고민
1. 왜 사람들이 Layered Architecture가 아닌 헥사고날을 많이 사용할까?
2. 헥사고날은 과연 편할까? 
   - 익숨함을 대체할 수 있을까? 
   - 그만큼 퍼포먼스를 낼 수 있을까?
   - 테스트 코드 작성에 용이할까?
3. 도메인 객체에 연관 관계가 있는 친구들은 어떻게 표현할까


### 아키텍처링
- Driving Adapter는 
- Port 개념은 DIP를 위해 존재한다. 


### 구현 규칙
- Controller는 UseCase들에 의존함
   - 각 UseCase는 단일 책임을 가지는 Interface라 볼 수 있다.
   - UseCase가 Port
- Usecase는 domain layer에 존재한다.
- Usecase는 Command와, Query라는 객체를 의존한다 .
- Usecase에서 영속 계층에 사용할 adapter는 DDD 강의에서 들었던 store reader등의 인터페이스로 해석할 수 있다.
   - 하지만 헬리오스님의 프로젝트에선 단순 class로 되어있다.
   - db adapter와 in-memory adapter를 분리함
- Service는 도메인의 공통적인 비즈니스 로직 처리를 담당한다.
- 유즈케이스들은 Service의 메서드들은 조합하여 비즈니스 로직을 만족시킨다. 즉, 유즈케이스는 도메인 서비스를 의존한다.
- 유즈케이스들은 ISP를 만족시키기 위해 조금더 명시적인 네이밍을 가지고 케이스를 분리한다.
  - ArticleUseCase 속에 methodA(), methodB()가 있는 것보단 
  - ArticleRegisterUserCase(), ArticleQueryByIdUserCase 등으로 나누는 것이 더 명시적이다.

### 고민되는 점
- Domain의 모델과 Entity를 어떻게 분리할 것인지?
- Book - Review와 같이 1:N 관계의 경우 어떻게 Domain Model에서 표현할 것인지?
- 유즈케이스에서 사용할 공통된 Service를 사용하는 것과 Domain 객체에서 일을 하는 것
  - 공통 서비스를 사용하는 경우
    - 외부 의존성들과 상호작용하기 편리하다.
    - 도메인 로직은 외부 의존성들과 상호작용할 수 있기 때문에 Service를 따로 두는 것도 좋다.
- 

### 헥사고날에서는 Domain 모델에서 비즈니스 로직이 구현되어야 함 따라서 최대한 Article이라는 애그리거트가  많은 정보를 가지고 있으면 좋음
