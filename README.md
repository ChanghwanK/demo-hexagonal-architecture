# Challenge's
1. Hexagonal과 Layered Arichitecture 장/단점 이해하기
2. 나만의 Hexagonal Best Practice 구축

## 고민's
1. 왜 Hexagonal Arichitecture인가?
2. 헥사고날은 과연 편할까? 
   - 익숨함을 대체할 수 있을까? 
   - 그만큼 퍼포먼스를 낼 수 있을까?
   - 테스트 코드 작성에 용이할까?
3. Domain 객체와 Entity를 분리하면 좋을까?

## Conclusion's
> 왜 Hexagonal Arichitecture인가?

[WIKI 보러가기](https://github.com/ChanghwanK/demo-hexagonal-architecture/wiki/Why-Hexagonal%3F%3F)


### Domain 객체와 Entity를 분리하면 좋을까?

Domain 객체와 Entity는 분리하는 것을 권장한다. 이는 Persistence Ignorance 원칙을 따르는 패턴이기도하며 자세한 이유는 다음과 같다.

**1. 도메인 객체는 비즈니스 로직에만 집중할 수 있다.**

JPA Entity는 데이터베이스와의 상호작용을 위한 기능도 담당하기 때문에, 도메인 로직과 분리되어 있지 않으면 도메인 객체는 비즈니스 로직과 데이터베이스 로직을 함께 처리해야 한다. 이를 통해 도메인 로직을 이해하기 어렵고, 변경하기도 어려운 복잡한 코드가 될 수 있는 반면, 도메인 객체와 JPA Entity를 분리하면 도메인 객체는 비즈니스 로직에만 집중할 수 있어 도메인 로직을 더욱 깔끔하고 간결하게 작성할 수 있다.

**2. 도메인 객체는 독립적으로 발전할 수 있기 때문이다.**

JPA Entity는 데이터베이스와의 매핑을 위한 어노테이션 등을 사용하기 때문에, 이를 수정하면 데이터베이스 스키마에 영향을 미친다. 반면 도메인 객체는 비즈니스 로직에만 집중하기 때문에, 데이터베이스 스키마의 변경과는 별개로 도메인 객체를 변경할 수 있으며, 이를 통해 도메인 객체는 독립적으로 발전할 수 있다.
