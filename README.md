# Challenge
1. Hexagonal과 Layered Arichitecture 장/단점 이해하기
2. 나만의 Hexagonal Best Practice 구축

### 고민's
1. 왜 사람들이 Layered Architecture가 아닌 헥사고날을 많이 사용할까?
2. 헥사고날은 과연 편할까? 
   - 익숨함을 대체할 수 있을까? 
   - 그만큼 퍼포먼스를 낼 수 있을까?
   - 테스트 코드 작성에 용이할까?
3. 도메인 객체에 연관 관계가 있는 친구들은 어떻게 표현할까

### Conclusion
- Domain의 모델과 Entity를 분리하자
- 유즈케이스에서 사용할 공통된 Service를 사용하는 것과 Domain 객체에서 일을 하는 것
  - 공통 서비스를 사용하는 경우
    - 외부 의존성들과 상호작용하기 편리하다.
    - 도메인 로직은 외부 의존성들과 상호작용할 수 있기 때문에 Service를 따로 두는 것도 좋다.
