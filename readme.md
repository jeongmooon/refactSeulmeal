# JPA

## Jpa Repository Interface
- Genercie으로는 Entity클래스와 클리스의 @Id가 되는 필드타입 선언
- 메소드들이 이미 몇개가 구현되어 있다

```
- save : 레코드 한건 저장(insert, update)
- saveAll : 레코드 자중 저장(save보다 여러건 처리시에 성능이 좋음)
- findOne : primary key로 레코드 한건 찾기
- findAll : 전체 레코드 불러오기, 정렬(sort), 페이징(pageable) rksmd
- count : 레코드 갯수
- exists : 데이터 존재하는지 확인 하기위한 것
- deleteById : 단건 삭제
- deleteAll : 여러건 삭제

- 쿼리 메소드 규칙
    - findBy 시작 : 쿼리를 요청하는 메서드
    - countBy 시작 : 쿼리 결과 레코드 수를 요청

- 쿼리 메소드 키워드
    - And : findBy[Email]And[UserId](String email, String userId)
        - 여러 필드를 and로 검색
    - Or : findBy[Email]Or[UserId](String email, String userId)
        - 여러 필드를 or로 검색
    - Between : findBy[CreatedAt]Between(Date fromDate, Date toDate)
        - 필드의 두 값 사이에 있는 항목을 검색
    - LessThan : findBy[AgeGrater]Than[Equal](int age)
        - 작은 항목 검색
    - GrateThaneEqual : findBy[Age]GrateThanEqual(int age)
        - 크거나 같은 항목 검색
    - Like : findBy[Name]Like(String name)
        - like 검색
    - IsNull : findBy[Job]IsNull()
        - null인 항목 검색
    - In : findBy[Job](String ...jobs)
        - 여러 값 중에 하나인 항목 검색
    - OrderBy : findByEamilOrderBy[Name]Asc(String email)
        - 검색 결과를 소팅 후 전달
    
    - http://docs.spring.io/spring-data/jpa/docs/1.10.1.RELEASE/reference/html/#jpa.sample-app.finders.strategies
```