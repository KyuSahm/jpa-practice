# JPA (Java Persistence API)

- JPA의 개념
  - [JPA 개념 정리 페이지](https://velog.io/@adam2/JPA%EB%8A%94-%EB%8F%84%EB%8D%B0%EC%B2%B4-%EB%AD%98%EA%B9%8C-orm-%EC%98%81%EC%86%8D%EC%84%B1-hibernate-spring-data-jpa)
  - The Java Persistence API(JPA), in 2019 renamed to Jakarta Persistence, is a Java application programming interface specification that describes the management of relational data in applications using Java Platform, Standard Edition and Java Platform, Enterprise Edition/Jakarta EE
  - ORM (Object Relational Mapping)
    - [ORM 개념 정리 페이지](https://gmlwjd9405.github.io/2019/02/01/orm.html)
    - 객체와 관계형 데이터베이스의 데이터를 자동으로 맵핑해 주는 것
    - 객체 지향 프로그래밍은 클래스를 사용하고, 관계형 데이터베이스는 테이블을 사용
    - 객체 모델과 관계형 모델 간에 불일치가 존재
    - ORM 을 통해 객체간의 관계를 바탕으로 SQL을 자동으로 생성하여 불일치를 해결
    - 데이터베이스 데이터 <----맵핑----> Object 필드
    - 객체를 통해 간접적으로 데이터베이스 데이터를 다룬다
  - JPA(Java Persistence API)
    - Java 진영의 ORM 표준
    - Persistence 영역(데이터)에 접근하기 위한 API의 규격
    - JPA Library(jakarta.persistence-api-2.2.3.jar) : IntelliJ >> Project Window >> External Libraries에서 확인 가능
    - JPA Library의 코드를 살펴보면, 대부분 Interface, Annotation, Enum로만 구성
    - 중요 Interface
      - EntityManager
  - JPA 구현체
    - Hibernate Library (주로 사용)
      - hibernate-core-5.4.32.Finar.jar : IntelliJ >> Project Window >> External Libraries에서 확인 가능
    - Eclipse Link    
    ![JPA Implementation](./images/JPA_Implementation.png)  
  - Spring Data Jpa
    - Spring에서 Hibernate 라이브러리의 자주 쓰이는 기능들을 좀 더 간편하게 사용할 수 있도록, Wrapper Class형태로 감싸서 만들어 놓은 라이브러리
    - EntityManager에 직접 접근하지 않고, Data에 대한 접근을 좀 더 쉽고 객체지향적으로 처리할 수 있도록 해 줌
    - spring-boot-starter-data-jpa-2.5.5.jar : IntelliJ >> Project Window >> External Libraries에서 확인 가능
    - spring-data-jpa-2.5.5.jar
    - IntelliJ에 라이브러리와 관련된 source jar도 함께 배포 되므로, 실제 코드를 확인 가능

![Spring Data Jpa](./images/Spring_Data_Jpa.png)    
- JPA 구조도  
![JPA Structure](./images/JPA_Structure.png)


## IntelliJ IDE 

#### Ultimate Edition vs Community Edition

###### 공통으로 지원하는 기능

- Java, Kotlin, Groovy, Scalar
- Android
- Maven, Gradle, sbt
- Git, SVN, Mercurial
- 디버거

###### Community Edition에서 지원되지 않는 기능

- 프로파일링 도구
- Spring, Jakarta EE, Micronaut, Ouarkus, Helidon 등
- Swagger, Open API 사양
- JavaScript, TypeScript
- 데이터베이스 도구, SQL

#### 단축키(Short Key) 사용법
- 에디터 창에서 프로젝트 창으로 이동: Alt + 1
- 프로젝트 창에서 에디터 창으로 이동
  - 프로젝트 창을 닫으면서 이동: Alt + 1
  - 프로젝트 창을 다지 않고 이동: Esc Key
- 프로젝트 창에서 클래스 파일 선택 후, 소스 미리 보기: Space Key
  - 소스 미리 보기 상태에서 화살표 키를 이용해 클래스 파일 이동 가능
- 에디터 창 최대화/최소화: Ctrl + Shift + F12 
- 여러 개의 에디터 창 이동: Ctrl + Tab 키를 눌러서 팝업 창을 띄운 후, Tab키를 계속 눌러 소스 선택 
- 새 파일 생성
  - 에디터 창에서 Ctrl + Alt + Insert 
  - 프로젝트 창에서 Alt + Insert
- 에디터 창에서 커서 이동    
  - 단어별 이동: Ctrl + <- ->
  - 라인 시작/끝 이동: home, end
  - 페이지 위/아래: page up, page down
- 소스 코드 선택 확장/축소: Ctrl + W/Ctrl + Shift + W
- 주석 처리 및 해제  
  - 한줄 주석: Ctrl + /
  - 블록 주석: Ctrl + Shift + /
- Indentation  
  - Indentation: Tab
  - Indentation: Shift + Tab
- 자동 Indentation: Ctrl + Alt + I  
  - Ctrl + A Key로 전체 소스 선택 후, 처리 가능
- 사용처 찾기: 해당 코드가 사용되는 곳을 찾음
  - 찾기: Alt + F7
  - 빠른 찾기: Ctrl + B
- 파일 내 검색
  - 찾기: Ctrl + F
  - 찾은 결과 아래로 이동: F3
  - 찾은 결과 위로 이동: Shift + F3
- 경로 내 검색: Ctrl + Shift + f  
  - "In Project", "Module", "Directory", "Scope" 등을 선택 
- 전체 검색: Shift를 두번 누름
  - IntelliJ안의 모든 범위에서 검색
  - 소스 뿐만 아니라, IntelliJ내의 기능도 검색 가능
- 최근 파일 열기: Ctrl + e
- Live template: Ctrl + j
  - main method: psvm 친 후, Ctrl + j
  - System.out.println(): sout을 친 후, Ctrl + j
  - Ctrl + j 키만 누르면, 제공해 주는 Live template의 리스트를 볼 수 있음
- QuickFix 기능: Alt + Enter  
  - "List<String> list;"와 같은 코드를 입력 하고, List에 커서를 둔 후, Alt + Enter를 치면 컴파일 에러를 해결할 후보들을 알려줌.
- 코드 이슈 별로 이동: F2, Shift + F2
  - 에러가 발생한 부분이 여러 곳일 경우, 이슈 별로 이동
  - 다음으로 이동:  F2
  - 이전으로 이동: Shift + F2
- 사용하지 않는 Import문 제거: Ctrl + Alt + o  ​	
- 코드 생성: Alt + Ins  
  - 생성자, Getter 또는 Setter를 생성할 때 주로 사용
  - 소스상에서 마우스 우측 버튼 클릭 후, "Generate"로도 가능
- 메소드 자동완성
  - override: Ctrl + o
  - implement: Ctrl + i
  - 소스상에서 마우스 우측 버튼 클릭 후, "Generate"로도 가능
- IntelliJ에서 제공하는 터미널 창 열기: Alt + F12
  - git command를 사용할 수 있음
- 구문 완성: Ctrl + Shift + Enter
- 대체하기
  - 파일 내 대체: Ctrl + r
  - 경로 내 대체: Ctrl + Shift + r
- Run Anything: Ctrl Key를 두번 누름
  - 최신 Run 목록이 제시됨
  - main() 메소드가 있는 클래스를 검색해서 실행해도 됨
- 실행
  - 에디터 실행: main() 메소드가 있는 소스 창에서 Ctrl + Shift + F10으로 실행
  - 가장 최근의 실행: Shift + F10
- 실행 중인 프로세스 종료: Ctrl + F2
- 라인 수정
  - 복사: Ctrl + d
  - 삭제: Ctrl + y
- 메소드의 파라메터 정보 보기: Ctrl + p
  - 사용하고 있는 메소드 명에서 키를 누르면, 정의된 메소드의 파라메터 정보를 볼 수 있음.  
- 메소드의 구현부 찾아가기: Ctrl + Alt + b
  - 메소드의 실제 구현부를 찾아감.  
- Quick Definition: Ctrl + Shift + i
  - 사용하고 있는 메소드 명에서 키를 누르면, 정의된 메소드의 선언부를 미리보기 할 수 있음.
- Quick Document: Ctrl + Q     
  - 사용하고 있는 메소드 명에서 키를 누르면, 정의된 메소드의 선언부의 API 정보를 볼 수 있음.
  - Java Doc으로 기록한 정보를 보여줌
- Java Doc 양식 생성: 메소드의 위에서 "/**"을 입력한 후, Enter 키 입력
- 기능(action) 찾기: Ctrl + Shift + A
  - 단축키 정보를 찾을 수 있음
  - Help > Keymap Reference: 단축키 문서를 보여줌.
- Navigate 키
  - 뒤로 가기: Ctrl + Alt + left
  - 앞으로 가기: Ctrl + Alt + right  

#### 단축키 (Short Key) 응용편
- 테스트 코드 작성: Alt + Enter
  - 테스트 코드를 작성하고 싶은 소스 파일에서, "Alt + Enter"을 클릭
- 소스코드와 테스트 코드 번갈아 이동: Ctrl + Shift + t
  - 테스트 코드가 없다면 새로운 테스트를 작성하는 메뉴가 뜸
- 테스트 코드 실행 및 정지
  - 선택한 테스트 실행: Ctrl + Shift + F10
  - 정지 : Ctrl + F2
- 리팩토링
  - 클래스명을 선택 후, 다른 패키지로 이동: F6 (실제 참조하고 있는 코드도 모두 변경됨)
  - 바꾸고 싶은 타입을 선택 후, 타입 변경: Ctrl + Shift + F6
  - 메소드 시그니처 변경(접근자, 반환타입, 파라메터 타입): Ctrl + F6
  - 변수명 변경(관련된 모든 변수명이 변경됨): Shift + F6
  - 리팩토링 메뉴 전체 보기: Ctrl + Alt + Shift + t
- 디버깅
  - 브레이크 포인트 설정/해제: Ctrl + F8
  - 브레이크 포인트 목록 보기: Ctrl + Shift + F8 후, More 버튼을 누르면 전체 목록을 볼 수 있음.
  - 디버깅 모드 실행
    - 가장 최근의 실행: Shift + F9
	- 에디터 실행: 윈도우는 없음. 상단의 메뉴에서 Run > Debug 메뉴 이용
  - Step into: F7
  - Step over: F8
  - Resume Program(다음 브레이크 포인트 또는 끝까지): F9	
- Git
  - 간단한 Git 명령어 목록: alt + `  
- Custom Short Key 추가
  - shift Key를 두번 눌러 Keymap 검색
  - Configure Keymap 선택
  - "split" 검색 후, 해당 메뉴 선택
  - 마우스 오른쪽 키 눌러서, "add keyboard shortcut"

#### Spring Initializer 생성방법
1. "https://start.spring.io/"에 접속
2. "Gradle Project" 선택
3. Language "Java" 선택
4. Spring Boot에서 버전 선택
5. Articfact에 프로젝트 이름 기입
6. Packaging에서 "Jar" 선택
7. Java Version 선택
8. 우측의 Dependency 추가 - Spring Web, Spring Data JPA, H2 Database, Lombok
9. Generate
10. Zip 파일 생성
11. Explorer를 선택해서, 상세 정보 확인 가능
12. Zip파일의 압축을 푼 후, 내용을  Workspace로 복사
13. IntelliJ의 Open Project에서 build.gradle 파일을 선택해서 Open
14. Run 명령어를 실행

###### Spring Initializer 작명법
- Group
  - Domain 이름을 역순으로 기입
  
```text
com.fastcampus.jpa
```
- Artifact
  - 해당 프로젝트 이름
  - 생성 후, Group과 Artifact을 합친 package name이 기본적으로 생성
```text
bookmanager // com.fastcampus.jpa.bookmanager이라는 패키지가 기본적으로 생성됨.
```
- Type 
  - Maven
  - Gradle

- Language
  - Java
  - Kotlin
  - Grocvy

- Java version
  - 17
  - 11
  - 8

## Annotation Summary
#### JPA 관련
- [JPA 관련 Annotation 정리사이트](https://www.icatpark.com/entry/JPA-%EA%B8%B0%EB%B3%B8-Annotation-%EC%A0%95%EB%A6%AC)
- Spring Boot 설정
  - spring.jpa.hibernate.ddl-auto 설정이 create 또는 update일 경우
    - Spring 프로젝트 시작 시, EntityManager이 자동으로 테이블 생성(By DDL)

###### @Entity
- 데이터베이스의 테이블과 일대일로 매칭되는 객체단위
- Entity 객체의 인스턴스 하나가 테이블에서 하나의 레코드 값을 의미
- 객체 인스턴스를 구분하기 위한 유일한 키값을 가짐
  - 테이블 상의 Primary Key와 같은 의미를 가지며, @Id Annotation으로 표기

###### @Table
- 명시적으로 데이터베이스상의 테이블 명칭을 지정
- 명시적으로 작성하는 것이 관례
  - 데이터베이스 상에서 보편적으로 사용되는 명명법이 UnderScore 원칙 때문
- 지정하지 않으면 Entity 클래스의 이름 그대로 CamelCase를 유지한 채로 테이블 생성

```java
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
```
###### @Id
- 데이터베이스의 테이블은 기본적으로 유일한 키(Primary Key) 가짐
- JPA에서도 Entity 클래스 상에 PK를 명시적으로 표시해야 함
- @Id Annotation을 이용해 PK임을 지정

```java
@Id
@Column
private String code;
```

###### @GeneratedValue
- Primary Key칼럼의 데이터 형식은 정해져 있지 않으나, 유일한 키값을 가져야 함
  - BigInteger에 해당하는 Java의 Long 타입을 주로 사용
- MySQL은 auto increment 방식을 사용
  - 숫자형의 PK 칼럼 속성을 auto increment로 지정
  - 자동으로 새로운 레코드가 생성 될때마다, 마지막 PK값에서 자동으로 +1을 해줌
  - @GeneratedValue Annotation의 strategy 속성을 GenerationType.IDENTITY로 지정
    - EntityManager이 GenerationType.IDENTITY 속성을 통해 auto increment 칼럼인 것을 인지함
```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```
- Oracle은 Sequence 방식을 사용
  - Sequence 객체를 생성해 두고, 호출할 때마다 기존 값의 +1이 된 값을 반환해 주는 방식
  - @GeneratedValue Annotation의 strategy 속성을 GenerationType.SEQUENCE로 지정
```java
@Id
@SequenceGenerator(name="seq", sequenceName="jpa_sequence")
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
private Long id;
```

###### @Transactional
- [링크 - @Transactional 정리 및 예제](https://goddaehee.tistory.com/167)
- 메소드위에 @Transactional이 추가되면, 이 클래스에 트랜잭션 기능이 적용된 프록시 객체가 생성
- 프록시 객체는 @Transactional이 포함된 메소드가 호출될 경우
  - PlatformTransactionManager를 사용하여 트랜잭션을 시작
  - 정상 수행 여부에 따라 Commit 또는 Rollback 처리를 수행

#### 복합 키(Composite Primary Keys)
- [참조사이트 - Composite Primary Keys in JPA](https://www.baeldung.com/jpa-composite-primary-keys)
- 두 개이상의 칼럼이 하나의 Primary Key를 구성
- 복합 키를 정의하는 두가지 방법이 존재
  - @IdClass Annotation 사용
  - @EmbeddedId Annotation 사용 

###### @IdClass
- 가정
  - Account 테이블이 존재
  - 복합 키를 형성하는 accountNumber과 accountType이 존재
- accountNumber과 accountType을 가진 AccountId 클래스 생성
```java
public class AccountId implements Serializable {
    private String accountNumber;

    private String accountType;

    // default constructor
    public AccountId(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // equals() and hashCode()
}
```
- AccountId 클래스를 Entity인 Account와 Annotation을 이용해서 연결
  - @IdClass Annotation을 이용
  - Entity인 Account 클래스 내에 AccountId 클래스의 필드들을 중복 선언해야 함
    - 해당 필드들을 @Id를 통해 Annotation해야 함
```java
@Entity
@IdClass(AccountId.class)
public class Account {
    @Id
    private String accountNumber;

    @Id
    private String accountType;

    // other fields, getters and setters
}
```
###### @EmbeddedId
- 가정
  - Book 테이블이 존재
  - Composite Primary Key를 형성하는 title와 language가 존재
- Primary Key를 정의한 클래스인 BookId는 @Embeddable로 Annotate해야 함
```java
@Embeddable
public class BookId implements Serializable {
    @Column(name = "title")
    private String title;
    @Column(name = "lang")
    private String language;

    // default constructor

    public BookId(String title, String language) {
        this.title = title;
        this.language = language;
    }

    // getters, equals() and hashCode() methods
}
```
- Entity인 Book 클래스의 내부에 BookId를 Embedding함
 - @EmbeddedId를 사용
```java
@Entity(name = "book")
public class Book {
    @EmbeddedId
    private BookId bookId;
    // constructors, other fields, getters and setters
}
```
###### @IdClass vs @EmbeddedId
- @IdClass를 사용할 경우, Primary Key 칼럼들을 두 개의 클래스에서 중복 선언해야 함
  - AccountId와 Account 클래스에서 각각 한번씩
- @EmbeddedId는 한번만 하면 됨
- SQL Query 비교
```sql
--With @IdClass, the query is a bit simpler
SELECT account.accountNumber FROM Account account;
--With @EmbeddedId, we have to do one extra traversal
SELECT book.bookId.title FROM Book book;
```
- @IdClass는 복합 키(Composite Key)에 대한 수정이 없을 경우에 유리
- @EmbeddedId는 복합 키를 오브젝트로서 자주 사용하는 경우에 유리

#### Test 관련
- [Spring Test관련 Annotation 정리 사이트](https://happyer16.tistory.com/entry/Spring-Boot-Test-%EC%A2%85%ED%95%A9-%EC%A0%95%EB%A6%AC)
###### @SpringBootTest
- Spring Context를 로딩해서 통합 테스트를 실시
- 모든 빈을 등록하여 테스트를 진행
- classes 속성을 이용하여 필요한 빈만 등록하는 것이 유리
- @RunWith: JUnit의 러너를 사용하는게 아니라 지정된 SpringRunner 클래스를 사용
- @EnableConfigurationProperties : Configuration으로 사용하는 클래스를 빈으로 등록할 수 있게 함
```java
@RunWith(SpringRunner.class)
@SpringBootTest(
        properties = {
                "property.value=propertyTest",
                "value=test"
        },
        classes = {TestApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@EnableConfigurationProperties(StayGolfConfiguration.class)
public class TestApplicationTests {

    @Value("${value}")
    private String value;

    @Value("${property.value}")
    private String propertyValue;

    @Test
    public void contextLoads() {
        assertThat(value, is("test"));
        assertThat(propertyValue, is("propertyTest"));
    }

}
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "supplier.staygolf")
public class StayGolfConfiguration {
```

###### @WebMvcTest
- 웹상에서 요청과 응답에 대한 테스트
- MVC 테스트를 가능하도록 Mock MVC를 생성
- @Controller, @ControllerAdvice, @JsonComponent와 Filter, WebMvcConfiguer, HandlerMethodArgumentResolver만 로드
- 전체 테스트보다는 가볍움
```java
@RunWith(SpringRunner.class)
@WebMvcTest(BookApi.class)
public class BookApiTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private BookService bookService;

    @Test
    public void getBook_test() throws Exception {
        //given
        final Book book = new Book(1L, "title", 1000D);

        given(bookService.getBook()).willReturn(book);

        //when
        final ResultActions actions = mvc.perform(get("/books/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());

        //then
        actions
                .andExpect(status().isOk())
                .andExpect(jsonPath("id").value(1L))
                .andExpect(jsonPath("title").value("title"))
                .andExpect(jsonPath("price").value(1000D))
        ;

    }
```
###### @DataJpaTest
- JPA 관련 테스트
- JPA 관련된 설정만 로드
- @Entity 클래스를 스캔하여 스프링 데이터 JPA 저장소를 구성
- 기본적으로 인메모리 데이터베이스를 이용
- 데이터소스의 설정이 정상적인지, JPA를 사용하서 데이터를 제대로 생성, 수정, 삭제하는지 등의 테스트가 가능
- @AutoConfigureTestDataBase : 데이터 소스를 어떤 걸로 사용할지에 대한 설정
  - Replace.Any : 기본적으로 내장된 데이터소스를 사용
  - Replace.NONE : @ActiveProfiles 기준으로 프로파일이 설정됨
- @DataJpaTest : 테스트가 끝날 때마다 자동으로 테스트에 사용한 데이터를 롤백
```java
**
	 * What the test database can replace.
	 */
	enum Replace {

		/**
		 * Replace any DataSource bean (auto-configured or manually defined).
		 */
		ANY,

		/**
		 * Only replace auto-configured DataSource.
		 */
		AUTO_CONFIGURED,

		/**
		 * Don't replace the application default DataSource.
		 */
		NONE

	}
@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookJpaTest {


    @Autowired
    private BookRepository bookRepository;

    @Test
    public void book_save_test() {
        final Book book = new Book("title", 1000D);
        final Book saveBook = bookRepository.save(book);
        assertThat(saveBook.getId(), is(notNullValue()));
    }

    @Test
    public void book_save_and_find() {
        final Book book = new Book("title", 1000D);
        final Book saveBook = bookRepository.save(book);
        final Book findBook = bookRepository.findById(saveBook.getId()).get();
        assertThat(findBook.getId(), is(notNullValue()));
    }
}
```
###### @RestClientTest
- REST 관련 테스트
- Rest 통신의 JSON 형식이 예상대로 응답을 반환하는지 등을 테스트
- @RestClientTest : 테스트 대상이 되는 빈을 주 입받음
- @Rule
- MockRestServiceServer
  - 클라이언트와 서버 사이의 REST 테스트를 위한 객체
  - 내부에서 RestTemplate을 바인딩하여 실제로 통신이 이루어지게끔 구성할 수 있음
  - 이 코드에서는 목 객체와 같이 실제 통신이 이루어지지는 않지만 지정한 경로에 예상되는 반환값을 명시함.
```java
@RunWith(SpringRunner.class)
@RestClientTest(BookRestService.class)
public class BookRestServiceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private BookRestService bookRestService;

    @Autowired
    private MockRestServiceServer server;

    @Test
    public void rest_test() {

        server.expect(requestTo("/rest/test"))
                .andRespond(
                        withSuccess(new ClassPathResource("/test.json", getClass()), MediaType.APPLICATION_JSON));

        Book book = bookRestService.getRestBook();

        assertThat(book.getId(), is(notNullValue()));
        assertThat(book.getTitle(), is("title"));
        assertThat(book.getPrice(), is(1000D));

    }
}
// test.json
{
  "id": 1,
  "title": "title",
  "price": 1000
}
```
###### @JsonTest
- Json, Jackson의 테스트를 제공
```java
@RunWith(SpringRunner.class)
@JsonTest
public class BookJsonTest {

    @Autowired
    private JacksonTester<Book> json;

    @Test
    public void json_test() throws IOException {

        final Book book = new Book("title", 1000D);

        String content= "{\n" +
                "  \"id\": 0,\n" +
                "  \"title\": \"title\",\n" +
                "  \"price\": 1000\n" +
                "}";


        assertThat(json.parseObject(content).getTitle()).isEqualTo(book.getTitle());

        assertThat(json.write(book)).isEqualToJson("/test.json");
    }
}
```

###### @DisplayName
- method 명으로 표현하기 부족했다면 해당 어노테이션을 유용하게 사용
```java
@RunWith(SpringRunner.class)
@SpringBootTest
@DisplayName("어떤 클래스를 테스트")
public class TestApplicationTests {

    @Test
    @DisplayName("어떤 어떤 테스트를 진행")
    public void contextLoads() {
        assertThat(value, is("test"));
        assertThat(propertyValue, is("propertyTest"));
    }

}
```
###### Lifecycle Annotation
- @BeforeClass, @AfterClass -> @BeforeAll, @AfterAll
- @Before, @After -> @BeforeEache, @AfterEach

###### @Nested
- 중첩된 테스트 클래스
```java
@DisplayName("조회 테스트")
@Nested
class ReviewServiceTest {

	@DisplayName("여러 seq로 조회")
    @ParameterizedTest(name = "seq {0} 조회")
    @ValueSource(longs = { 1L, 2L })
    void getBySeq(Long seq){
    	Review review = reviewService.getByReviewSeq(seq);
        assertThat(review).isNotNull();
    }
}
```



## Lombok
- Annotation을 활용하여, Getter, Setter, Constructor, toString, hashCode등의 함수를 컴파일 시 생성토록 할 수 있음.
#### build.gradle 설정

```gradle
configurations {
	compileOnly {
		extendsFrom annotationProcessor
	}
}
....
dependencies {
    ....
	compileOnly 'org.projectlombok:lombok'
	annotationProcessor 'org.projectlombok:lombok'
	....
}
```

#### Annotation
- [참조 링크: https://www.daleseo.com/lombok-popular-annotations/ - 자주 사용되는 Lombok Annotation](https://www.daleseo.com/lombok-popular-annotations/)
- 파일을 컴파일할 때, 해당 코드들을 생성
- Lombok을 비적용을 해서 실제 생성 코드를 확인 가능
  - 마우스 오른쪽 클릭 > Refactor > Delombok 

###### @Getter
- 클래스 스코프에서 사용 시, 클래스 필드들에 대해서 getXXX() 메소드 자동 생성
- 필드 스코프에서 사용 시, 특정 필드에 대해서 getXXX() 메소드 자동 생성

###### @Setter
- 클래스 스코프에서 사용 시, 클래스 필드들에 대해서 setXXX() 메소드 자동 생성
- 필드 스코프에서 사용 시, 특정 필드에 대해서 setXXX() 메소드 자동 생성

###### @ToString
- 클래스의 toString() 메소드를 자동 생성
- ``exclude`` 엘리먼트를 통해 특정 필드를 제외 가능
- ``callSuper`` 엘리먼트를 통해 부모의 toString() 메소드 호출을 포함 가능
```javaa
@ToString(exclude = "password", callSuper = true)
public class User {
  private Long id;
  private String username;
  private String password;
  private int[] scores;
}
```
###### @NoArgsConstructor
- 인자가 없는 기본 생성자 코드 생성
- JPA의 경우, @NoArgsConstructor가 꼭 필요
  - Repository에서 Entity를 조회하는 경우에 Entity를 생성할 때 기본생성자를 이용하기 때문

###### @AllArgsConstructor
- 모든 필드들을 인자로 받아서 생성자 코드 생성

###### @RequiredArgsConstructor
- 별도로 지정된 필드가 없으면, 인자가 없는 기본 생성자 코드 생성
- @NonNull Annotation을 명시한 필드들을 이용한 생성자 코드 생성

```java
import lombok.*;

import java.time.LocalDateTime;

@ToString(exclude="email", callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
```
###### @EqualsAndHashCode
- equals()와 hashCode()에 대한 코드 생성

###### @Data
- ``@Getter``, ``@Setter``, ``@RequiredArgsConstructor``, ``@ToString``, ``@EqualsAndHashCode``을 한꺼번에 설정
- 주의할 사항으로 @NoArgsConstructor 또는 @AllArgsConstructor가 존재하면, @RequiredArgsConstructor을 설정하지 않음
  - @RequiredArgsConstructor를 명시적으로 설정해야 함

```java
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
```

###### @Builder
- Builder를 위한 클래스 코드 생성
- Builder의 형식을 가지고, 필드의 값을 주입
```java
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
```
```java
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private @NonNull String name;
        private @NonNull String email;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        UserBuilder() {
        }

        public UserBuilder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(@NonNull String email) {
            this.email = email;
            return this;
        }

        public UserBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public UserBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public User build() {
            return new User(name, email, createdAt, updatedAt);
        }

        public String toString() {
            return "User.UserBuilder(name=" + this.name + ", email=" + this.email + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
        }
    }
}
```

## Swagger
- Maven Repository에서 "[SpringFox Boot Starter](https://mvnrepository.com/artifact/io.springfox/springfox-boot-starter) " 검색

#### build.gradle 설정
```gradle
implementation group: 'io.springfox', name: 'springfox-boot-starter', version: '3.0.0'
```

#### 동작 확인
- "http://localhost:8080/swagger-ui/"에 접속하여 확인

## H2 In-Memory Database
- Java 기반의 경량화된 데이터베이스
- 두 가지 동작 방식을 지원
  - 파일로 저장
    - 실제 DB로 데이터를 유지
  - 인 메모리 기반으로 동작
    - 인스턴스가 동작하는 시점에만 유지
    - 프로젝트 초기 개발 기간에 테스트 DB로 사용
    - 유지 보수 기간에는 JUnit 테스트 용 DB로 사용
- build.gradle (의존성 추가)
```gradle
dependencies {
  ...
	runtimeOnly 'com.h2database:h2'
  ...
}
```
- 설정 파일 교체
  - 최근에는 properties 파일 보다는 yml 파일을 사용하는 추세
  - yml 파일이 계층적인 구조를 더 잘 표현   
  - src\main\resources\application.properties 삭제
  - src\main\resources\application.yml 파일 추가

- H2 database console enable
  - default 값은 false로 disable되어 있음
  - src\main\resources\application.yml의 설정값 추가 
```yaml
spring:
  h2:
    console:
      enabled: true
```
  - console 창에서 H2 관련 로그 확인
```console
2021-10-10 22:50:05.722  INFO 15536 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:7900322a-d9dc-45cf-ac21-7a4eade2fff1'
```
- H2 database Login on Web Browser
  - 웹 브라우저에서 http://localhost:8080/h2-console 접속
  - JDBC URL에 Console에 기록된 URL을 복사해서 입력 후, "connect"
  - 암호는 입력할 필요 없음
  - 접속 후, H2 Console에서 "show databases" 명령을 입력한 후, Run => 데이터베이스 목록

- H2 database Login on IntelliJ
  - Community Edition에는 지원안함
  - 화면 우측에 위치한 "Database"를 클릭
  - "+" 버튼 클릭
  - "Data Source" >> "H2" 선택
  - H2 Driver를 설치
  - JDBC URL 입력
  - Connection Type
    - Remote
    - In-memory : 선택
    - Embedded
    - URL Only
  - "Test Connection"으로  연결 확인
  - "OK" 버튼을 눌러서 설정 완료
  - 화면에 SQL 입력 창과 오른쪽에 Schemas들을 보여주는 Pane가 생김
- Server Port 변경
  - src\main\resources\application.yml의 설정값 추가
  - 8080 Port가 아닌 다른 값일 경우, 설정 
```yaml
serer:
  port: 8090
```
## Repository Interface
- 사용자는 Spring Data Jpa Library의 JpaRepository Interface를 상속한 Interface 정의
- Spring Data Jpa Library가 동적으로 사용자가 정의한 DB 관련 Interface를 구현해 줌
- Generic을 이용해서, Entity 클래스 타입과 Primary Key 타입을 명시
- 기본적으로, JpaRepository에 정의된 메소드를 상속
  - JpaRepository<T, ID>
    - findAll
    - findAll(Sort sort) // Sorting 관련
    - findAllById(Iterable\<ID\> ids); // SQL in 구문 사용
    - saveAll(Iterable\<S\> entities); // 여러 건을 한번에 저장
    - flush // DB에 반영     
    - saveAndFlush
    - saveAllAndFlush
    - deleteInBatch(Iterable\<T\> entities); // 여러 건을 한번에 지움
    - deleteAllInBatch() // 테이블 전체 데이터 삭제
    - deleteAllByIdInBatch
    - deleteAllInBatch
    - getOne(ID id) // Id 값을 이용해서 한 개의 레코드만 가져옴
    - getById
  - CrudRepository<T, ID> : 대부분의 중요한 메소드를 정의
    - save
    - saveAll
    - findById(Id id) // Id 값을 이용해서 한 개의 레코드만 가져옴
    - existsById(Id id) // Id 값을 이용해서 레코드의 존재 유무
    - findAll
    - findAllById
    - count() // 전체 레코드 개수
    - deleteById(Id id) // 특정 ID값의 레코드 삭제
    - delete
    - deleteAllById
    - deleteAll
    - deleteAll  

- 사용자 정의 Interface
```java
package com.gusami.jpa.bookmanager.repository;

import com.gusami.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
```
- Spring Data Jpa 내부의 Interface
```java
@NoRepositoryBean
public interface JpaRepository<T, ID> extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
.....
}
```
```java
public interface QueryByExampleExecutor<T> {
}
```
```java
public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {
	Iterable<T> findAll(Sort sort);
	Page<T> findAll(Pageable pageable);
}
```
```java
@NoRepositoryBean
public interface CrudRepository<T, ID> extends Repository<T, ID> {
```
```java
@Indexed
public interface Repository<T, ID> {
}
```
- 아래 코드와 같이, 새로운 User 객체를 생성해서 Repository Interface의 save 메소드를 두 번 호출
  - 두 개의 User Record가 DB에 저장
```java
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
```
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create, read, update, delete
        userRepository.save(new User());
        userRepository.save(new User());
        System.out.println(">>> " + userRepository.findAll());
    }
}
```
## 실습 환경 준비
#### Entity Class 정의
```java
package com.gusami.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
```
#### Test 환경에서 기본 레코드 삽입
- src > test 아래에 "resources" 디렉토리 생성
- "resources" 아래에서 data.sql 파일 생성
  - Spring boot Test가 실행할 경우에만 SQL이 실행
- 만약, src > main > resources 아래에 data.sql 파일을 생성하면?
  - SpringBoot가 실행할 때마다 SQL문들이 실행

- application.yml
  - h2 console 출력 Enable
  - SpringBoot Start/Stop 시에 테이블 Drop and Create and then Drop Table and sequences
  - SQL문을 console에 출력하기 위해 show_sql 옵션 추가
  - SQL문을 정렬해서 잘 볼 수 있게 하기 위해 format_sql 옵션 추가
  - data.sql파일에 등록된 DML문들을 DDL(Create Table)이 수행한 후에 수행되도록, defer-datasource-initialization enable

```yml
spring:
  h2:
    console:
      enabled: true
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: create-drop
    properties:
      hibernate:
        format_sql: true
        show_sql: true
    defer-datasource-initialization: true
server:
  port: 8080
```

#### Table 및 Sequence 생성
- Entity Class정의와 설정(application.yml)에 의해 Spring Boot 실행시마다 자동 생성
```sql
Hibernate: 
    
    drop table if exists user CASCADE 
Hibernate: 
    
    drop sequence if exists hibernate_sequence
Hibernate: create sequence hibernate_sequence start with 1 increment by 1
Hibernate: 
    
    create table user (
       id bigint not null,
        created_at timestamp,
        email varchar(255),
        name varchar(255),
        updated_at timestamp,
        primary key (id)
    )
```
## Repository Interface
#### Repository Interface 정의
```java
package com.gusami.jpa.bookmanager.repository;

import com.gusami.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
```
#### Repository Test 정의
```java
package com.gusami.jpa.bookmanager.repository;

import com.gusami.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create, read, update, delete
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }
}
```

#### 메소드별 작동 방식
###### findAll()
- 테이블의 모든 데이터를 검색
```java
@Test
    void crud() { // create, read, update, delete
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_
```
###### findAll(Sort sort)
- 테이블의 모든 데이터를 검색, name field를 기준으로 내림차순으로 정렬해서 보여줌
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create, read, update, delete
        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        users.forEach(System.out::println);
    }
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    order by
        user0_.name desc
```
###### findAllById(Iterable<ID> ids);
- 특정 ID 값들을 가지는 레코드를 검색
- SQL의 IN 구문을 사용
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create, read, update, delete
        //List<User> users = userRepository.findAllById(Arrays.asList(1L, 3L, 5L));
        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
        users.forEach(System.out::println);
    }
}
```sql
select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id in (
            ? , ? , ?
        )
```
###### List\<S\> saveAll(Iterable\<S\> entities);
- 여러 레코들을 삽입
- Insert 구문이 여러번 수행
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create, read, update, delete
        User user1 = new User("jack", "jack@fastcampus.com");
        User user2 = new User("steve", "steve@fastcampus.com");

        List<User> users = userRepository.saveAll(Lists.newArrayList(user1, user2));
        userRepository.findAll().forEach(System.out::println);
    }
}
```
```sql
Hibernate: 
    call next value for hibernate_sequence
Hibernate: 
    call next value for hibernate_sequence
Hibernate: 
    insert 
    into
        user
        (created_at, email, name, updated_at, id) 
    values
        (?, ?, ?, ?, ?)
Hibernate: 
    insert 
    into
        user
        (created_at, email, name, updated_at, id) 
    values
        (?, ?, ?, ?, ?)
```

###### S save(S entity);
- 하나의 레코드 삽입하거나 업데이트 함
- @Transactional Annotation을 사용
- 새로운 객체를 만들어서 save하면, 삽입
  - 아래의 코드처럼 getId()의 존재 여부를 이용해서 insert와 update를 판단
```java
@MappedSuperclass
public abstract class AbstractPersistable<PK extends Serializable> implements Persistable<PK> {
...
  @Transient // DATAJPA-622
	@Override
	public boolean isNew() {
		return null == getId();
	}
}
``` 
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create, read, update, delete
        User user1 = new User("jack", "jack@fastcampus.com");
        User user = userRepository.save(user1);
        userRepository.findAll().forEach(System.out::println);
    }
}
```
```sql
Hibernate: 
    call next value for hibernate_sequence
Hibernate: 
    insert 
    into
        user
        (created_at, email, name, updated_at, id) 
    values
        (?, ?, ?, ?, ?)
```
- 기존의 객체를 수정해서 save하면, 수정
  - getId()값을 이용해서 where절에 이용
```java
@Test
@Transactional
void crud() {
    User user = userRepository.findById(1L).orElseThrow();
    user.setEmail("martin-update@fastcampus.com");
    userRepository.save(user);

    List<User> users = userRepository.findAll();
    users.forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_0_,
        user0_.created_at as created_2_0_0_,
        user0_.email as email3_0_0_,
        user0_.name as name4_0_0_,
        user0_.updated_at as updated_5_0_0_ 
    from
        user user0_ 
    where
        user0_.id=?
Hibernate: 
    update
        user 
    set
        created_at=?,
        email=?,
        name=?,
        updated_at=? 
    where
        id=?
```

###### @Deprecated T getOne(ID id);
- ID를 이용해 하나의 레코드를 조회
- Proxy를 사용해야 하는데, 세션이 없어서 초기화를 못함
```console
could not initialize proxy [com.gusami.jpa.bookmanager.domain.User#1] - no Session
org.hibernate.LazyInitializationException: could not initialize proxy [com.gusami.jpa.bookmanager.domain.User#1] - no Session
	at app//org.hibernate.proxy.AbstractLazyInitializer.initialize(AbstractLazyInitializer.java:170)
	at app//org.hibernate.proxy.AbstractLazyInitializer.getImplementation(AbstractLazyInitializer.java:310)
	at app//org.hibernate.proxy.pojo.bytebuddy.ByteBuddyInterceptor.intercept(ByteBuddyInterceptor.java:45)
	at app//org.hibernate.proxy.ProxyConfiguration$InterceptorDispatcher.intercept(ProxyConfiguration.java:95)
	at app//com.gusami.jpa.bookmanager.domain.User$HibernateProxy$TziRGmA4.toString(Unknown Source)
```
- Lazy Fetch 방식을 사용
- @Transactional Annotation을 이용해서 Proxy 객체 생성 가능
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() { // create, read, update, delete
        User user = userRepository.getOne(1L);
        System.out.println(user);
    }
}
```sql
Hibernate: 
    select
        user0_.id as id1_0_0_,
        user0_.created_at as created_2_0_0_,
        user0_.email as email3_0_0_,
        user0_.name as name4_0_0_,
        user0_.updated_at as updated_5_0_0_ 
    from
        user user0_ 
    where
        user0_.id=?
```

###### Optional\<T\> findById(ID id);
- ID를 이용해 하나의 레코드를 조회
- toString()의 정의
```java
public final class Optional<T> {
...
@Override
    public String toString() {
        return value != null
            ? String.format("Optional[%s]", value)
            : "Optional.empty";
    }
...
}
```
- Eager Fetch 방식을 사용
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() { // create, read, update, delete
        Optional<User> user = userRepository.findById(100L);
        System.out.println(user);
    }
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_0_,
        user0_.created_at as created_2_0_0_,
        user0_.email as email3_0_0_,
        user0_.name as name4_0_0_,
        user0_.updated_at as updated_5_0_0_ 
    from
        user user0_ 
    where
        user0_.id=?
```
###### save() and flush() or saveAndFlush();
- [링크 - Flush란?](https://gmlwjd9405.github.io/2019/08/07/what-is-flush.html)
- DB에 실제 데이터를 반영
- 영속성 컨텍스트의 변경 내용을 DB 에 반영하는 것을 말한다.
- Transaction commit 이 일어날 때 flush가 동작
  - 쓰기 지연 저장소에 쌓아 놨던 INSERT, UPDATE, DELETE SQL들이 DB에 날라감
  - 주의! 영속성 컨텍스트를 비우는 것이 아님
  - 쉽게 얘기해서 영속성 컨텍스트의 변경 사항들과 DB의 상태를 맞추는 작업이다.
  - 플러시는 영속성 컨텍스트의 변경 내용을 DB에 동기화
- 로그 상에는 별 특이점이 보이질 않음 (추후에 영속성 컨텍스트에서 다룸) 
```java
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() { // create, read, update, delete
        User user1 = new User("jack", "jack@fastcampus.com");
        User user = userRepository.saveAndFlush(user1);
        //User user = userRepository.save(user1);
        //userRepository.flush();
        userRepository.findAll().forEach(System.out::println);
    }
}
```
```sql
Hibernate: 
    call next value for hibernate_sequence
Hibernate: 
    insert 
    into
        user
        (created_at, email, name, updated_at, id) 
    values
        (?, ?, ?, ?, ?)
```
###### long count();
- 레코드의 개수를 셈
```java
@Test
@Transactional
void crud() { // create, read, update, delete
    long count = userRepository.count();
    System.out.println(count);
}
```
```sql
Hibernate: 
    select
        count(*) as col_0_0_ 
    from
        user user0_
```
###### boolean existsById(ID id);
- 주어진 Primary Key인 ID의 존재 여부 확인
```java
@Test
@Transactional
void crud() { // create, read, update, delete
    boolean exist = userRepository.existsById(1L);
    System.out.println(exist);
}
```
```sql
Hibernate: 
    select
        count(*) as col_0_0_ 
    from
        user user0_ 
    where
        user0_.id=?
```
###### void delete(T entity);
- 주어진 Entity를 삭제
```java
@Test
@Transactional
void crud() { // create, read, update, delete

    userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
    userRepository.findAll().forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_0_,
        user0_.created_at as created_2_0_0_,
        user0_.email as email3_0_0_,
        user0_.name as name4_0_0_,
        user0_.updated_at as updated_5_0_0_ 
    from
        user user0_ 
    where
        user0_.id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
```
###### void deleteById(ID id);
- 특정 ID의 Entity를 제거
- Select Query가 먼저 실행되는 이유
  - 해당 Entity가 존재하는지를 먼저 확인
```java
@Test
@Transactional
void crud() {
    userRepository.deleteById(1L);
    userRepository.findAll().forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_0_,
        user0_.created_at as created_2_0_0_,
        user0_.email as email3_0_0_,
        user0_.name as name4_0_0_,
        user0_.updated_at as updated_5_0_0_ 
    from
        user user0_ 
    where
        user0_.id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
```
###### void deleteAll();
- 모든 데이터를 지움
- Delete Query를 여러 번 수행
```java
@Test
@Transactional
void crud() {
    userRepository.deleteAll();
    userRepository.findAll().forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_
Hibernate: 
    delete 
    from
        user 
    where
        id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
```

###### void deleteAll(Iterable\<? extends T\> entities);
- Delete Query를 여러 번 수행
```java
@Test
@Transactional
void crud() {
    userRepository.deleteAll(userRepository.findAllById(Arrays.asList(1L, 3L, 5L)));
    userRepository.findAll().forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id in (
            ? , ? , ?
        )
Hibernate: 
    delete 
    from
        user 
    where
        id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
Hibernate: 
    delete 
    from
        user 
    where
        id=?
```
###### void deleteInBatch(Iterable<T> entities);
- 특정 Entity들을 삭제
- or절을 이용해서 Delete Query 한번만 수행
```java
@Test
@Transactional
void crud() {
    userRepository.deleteInBatch(userRepository.findAllById(Arrays.asList(1L, 3L, 5L)));
    userRepository.findAll().forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id in (
            ? , ? , ?
        )
Hibernate: 
    delete 
    from
        user 
    where
        id=? 
        or id=? 
        or id=?
```
###### void deleteAllInBatch();
- 테이블의 모든 레코드 삭제
- 하나의 Delete Query만 수행
```java
@Test
@Transactional
void crud() {
    userRepository.deleteAllInBatch();
    userRepository.findAll().forEach(System.out::println);
}
```
```sql
Hibernate: 
    delete 
    from
        user
```
###### Page\<T\> findAll(Pageable pageable);
- 페이지 단위로 데이터를 가져오기
- Pageable는 "PageRequest.of(1, 2)"를 이용
  - pagesize가 2인 1 page를 가져와라.
  - page number는 zero-based number임
```java
@Test
@Transactional
void crud() {
    // page size가 2인 page 1의 데이터들을 가져와라.(page 0부터 시작)
    Page<User> users = userRepository.findAll(PageRequest.of(1, 2));
    // 전체 페이지와 현재 페이지 정보, 인스턴스정보
    System.out.println("page: " + users);
    // 전체 레코드 개수
    System.out.println("totalElements: " + users.getTotalElements());
    // 전체 페이지 수
    System.out.println("totalPages: " + users.getTotalPages());
    // 해당 페이지의 Element 개수
    System.out.println("numberOfElements: " + users.getNumberOfElements());
    // Sort(ASC, DESC) 적용 여부
    System.out.println("sort: " + users.getSort());
    // 페이지당 사이즈
    System.out.println("size: " + users.getSize());
    // 해당 페이지의 레코드들을 출력
    users.getContent().forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ limit ? offset ?
Hibernate: 
    select
        count(user0_.id) as col_0_0_ 
    from
        user user0_
page: Page 2 of 3 containing com.gusami.jpa.bookmanager.domain.User instances
totalElements: 5
totalPages: 3
numberOfElements: 2
sort: UNSORTED
size: 2
User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-14T23:00:43.443965, updatedAt=2021-10-14T23:00:43.443965)
User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-14T23:00:43.443965, updatedAt=2021-10-14T23:00:43.443965)        
```
#### Query by Example(QBE)
###### List\<S\> findAll(Example\<S\> example);
- Entity를 Example로 만들고, matcher를 추가하여 필요한 Query를 생성하는 방법
```java
@Test
@Transactional
void crud() {
    ExampleMatcher matcher = ExampleMatcher.matching()
            .withIgnorePaths("name")
            .withMatcher("email", endsWith());

    // 이름은 무시하고 매칭안하고, 이메일은 "fastcampus.com"으로 종료되는 User
    Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher);
    // matching 되는 결과를 받아옴
    userRepository.findAll(example).forEach(System.out::println);
}
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email like ? escape ?
User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-14T23:11:17.352710, updatedAt=2021-10-14T23:11:17.352710)
User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-14T23:11:17.352710, updatedAt=2021-10-14T23:11:17.352710)
```
- "withIgnorePaths"을 없애거나, matcher를 제거하면, exact matching 형태로 동작
  - "withIgnorePaths"을 없앤 경우
```java
@Test
    @Transactional
    void crud() {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("email", endsWith());

        Example<User> example = Example.of(new User("martin", "fastcampus.com"), matcher);

        userRepository.findAll(example).forEach(System.out::println);
    }
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.name=? 
        and (
            user0_.email like ? escape ?
        )
User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-14T23:18:18.694797, updatedAt=2021-10-14T23:18:18.694797)
```
  - matcher를 제거한 경우
```java
@Test
@Transactional
void crud() {
    Example<User> example = Example.of(new User("martin", "martin@fastcampus.com"));
        userRepository.findAll(example).forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.name=? 
        and user0_.email=?
User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-14T23:20:56.870036, updatedAt=2021-10-14T23:20:56.870036)
```
- 이메일에 특정 문자열을 포함하는 경우('%slow%')
```java
@Test
@Transactional
void crud() {
    User user = new User();
    user.setEmail("slow");
    ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
    Example<User> example = Example.of(user, matcher);
    userRepository.findAll(example).forEach(System.out::println);
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email like ? escape ?
User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-14T23:23:48.638727, updatedAt=2021-10-14T23:23:48.638727)
User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-14T23:23:48.638727, updatedAt=2021-10-14T23:23:48.638727)
```
#### SimpleJpaRepository 코드 보기
- Jpa Repository의 구현체를 제공하는 클래스
- 위에서 언급한 Interface 메소드를 실제 구현
- JpaRepositoryImplementation\<T, ID\>
  - JpaRepository\<T, ID\> interface를 상속한 Interface
```java
@NoRepositoryBean
public interface JpaRepositoryImplementation<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

	/**
	 * Configures the {@link CrudMethodMetadata} to be used with the repository.
	 *
	 * @param crudMethodMetadata must not be {@literal null}.
	 */
	void setRepositoryMethodMetadata(CrudMethodMetadata crudMethodMetadata);

	/**
	 * Configures the {@link EscapeCharacter} to be used with the repository.
	 *
	 * @param escapeCharacter Must not be {@literal null}.
	 */
	default void setEscapeCharacter(EscapeCharacter escapeCharacter) {

	}
}
```
- SimpleJpaRepository\<T, ID\>
  - JpaRepositoryImplementation\<T, ID\>와 상위 interface들을 구현한 클래스
```java
@Repository
@Transactional(readOnly = true)
public class SimpleJpaRepository<T, ID> implements JpaRepositoryImplementation<T, ID> {
  ....
}
```
## Query Method
- 복잡한 조건(Where절)을 가지는 쿼리를 생성
- Entity의 Repository interface에 Naming 베이스로 메소드를 선언하면, 자동으로 쿼리 생성
- Query return types
  - void: Denotes no return value
  - Primitives: Java primitives
  - Wrapper types: Java wrapper types
  - T: A unique entity. Expects the query method to return one result at most. If no results is found, null is returned. More than one result triggers an IncorrectResultSizeDataAccessException
  - Iterator\<T\>: An Iterator
  - Collection\<T\>: A Collection
  - List\<T\>: A List
  - Optional\<T\>: A Java 8 or Guava ``Optional``. Expects the query method to return one result at most. If no result is found,  ``Option.empty()`` or ``Optional.absent()`` is returned. More than one result triggers an IncorrectResultSizeDataAccessException
  - Option\<T\>: Either a Scalar or Vavr ``Option`` type. Semantically the same behavior as Java 8's ``Optional``, described earlier
  - Stream\<T\>: A Java 8 Stream
  - Streamable\<T\>: A convenience extension of ``Iterable`` that directly exposes methods to stream, map and filter results, concatenate them etc
  - Types that implement ``Streamable`` and take a ``Streamable`` constructor or factory method argument: Types that expose a constructor or ``..of(...)/...valueOf(...)`` factory method taking a ``Streamable`` as argument. See Returning Custom Streamable Wrapper Types for details
  - Vavr Seq, ``List``, ``Map``, ``Set``: Vavr collection types. See Support for Vavr Collections for details
  - ``Future<T>``: A ``Future``. Expects a method to be annotated with ``@Async`` and requires Spring's asynchronous method execution capability to be enabled
  - CompletableFuture\<T\>: A Java 8 ``CompletableFuture``. Expects a method to be annotated with ``@Async`` and requires Spring's asynchronous method execution capability to be enabled
  - ListenableFuture: A ``org.springFramework.util.concurrent.ListenableFuture``. Expects a method to be annotated with ``@Async`` and requires Spring's asynchronous method execution capability to be enabled
  - ``Slice<T>``: A sized chunk of data with an indication of whether there is more data available. Requires a ``Pageable`` method parameter
  - ``Page<T>``: A ``Slice`` with additional information, such as the total number of results. Requires a ``Pageable`` method parameter
  - ``GeoResult<T>``: A result entry with additional information, such as the distance to aa reference location
  - ``GeoResults<T>``: A list of ``GeoResult<T>`` with additional information, such as the average distance to a reference location
  - ``GeoPage<T>``: A ``Page`` with ``GeoResult<T>``, such as the average distance to a reference location
  - ``Mono<T>``
  - ``Flux<T>``
  - ``Single<T>``
  - ``Maybe<T>``
  - ``Flowable<T>``
- Query subject keywords
  - find...By, read...By, get...By, query...By, search...By, stream...By
    - find와 By 중간에 위치한 "..." 자리에는 사용자가 가독성을 위해 임의의 값을 사용가능
    - 사용자가 
  - exists...By
  - count...By
  - delete...By, remove...By
  - ...First\<number\>..., ...Top\<number\>...
  - ...Distinct...
- Query predicate keywords
  - AND: And
  - OR: Or
  - AFTER: After, IsAfter
  - BEFORE: Before, IsBefore
  - CONTAINING: Containing, IsContaining, Contains
  - BETWEEN: Between, IsBetween
  - ENDING_WITH: EndingWith, IsEndingWith, EndsWith
  - EXISTS: Exists
  - FALSE: False, IsFalse
  - GREATER_THAN: GreaterThan, IsGreaterThan
  - GREATER_THAN_EQUALS: GreaterThanEqual, IsGreaterThanEqual
  - IN: In, IsIn
  - IS: Is, Equals, (or no keyword)
  - IS_EMPTY: IsEmpty, Empty
  - IS_NOT_EMPTY: IsNotEmpty, NotEmpty
  - Is_NOT_NULL: NotNull, IsNotNull
  - IS_NULL: Null, IsNull
  - LESS_THAN: LessThan, IsLessThan
  - LESS_THAN_EQUAL: LessThanaEqual, IsLessThanEqual
  - LIKE: Like, IsLike
  - NEAR: Near, IsNear
  - NOT: Not, IsNot
  - NOT_IN: NotIn, IsNotIn
  - NOT_LIKE: NotLike, IsNotLike
  - REGEX: Regex, MatchesRegex, Matches
  - STARTING_WITH: StartingWith, IsStartingWith, StartsWith
  - TRUE: True, IsTrue
  - WITHIN: Within, IsWithin
#### Query subject keywords   
###### findByXXX()
- where절에 특정 칼럼 조건을 추가
- 사용자가 정의한 UserRepository에 인터페이스를 추가
- 리턴 타입도 결과 레코드들의 특성에 맞게 정의 가능
  - Query return types을 참조

```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    //Set<User> findByName(String name);
    //Optional<User> findByName(String name);
}
```
```java
@Test
    void select() {
        userRepository.findByName("martin").forEach(System.out::println);
    }
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.name=?
User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T19:03:33.325081, updatedAt=2021-10-17T19:03:33.325081)
User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-17T19:03:33.331084, updatedAt=2021-10-17T19:03:33.331084
```
- findByXXX, getByXXX, readByXXX, queryByXXX, searchByXXX, streamByXXX, findXXXByXXX
  - 동일한 결과를 얻음
  - 가독성을 위해 원하는 API를 선택해서 사용

```java
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User getByEmail(String email);
    User readByEmail(String email);
    User queryByEmail(String email);
    User searchByEmail(String email);
    User streamByEmail(String email);
    User findUserByEmail(String email);
    User findSomethingByEmail(String email);
}
```
```java
@Test
    void select() {
        System.out.println("findByEmail" + userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println("getByEmail" + userRepository.getByEmail("martin@fastcampus.com"));
        System.out.println("readByEmail" + userRepository.readByEmail("martin@fastcampus.com"));
        System.out.println("queryByEmail" + userRepository.queryByEmail("martin@fastcampus.com"));
        System.out.println("searchByEmail" + userRepository.searchByEmail("martin@fastcampus.com"));
        System.out.println("streamByEmail" + userRepository.streamByEmail("martin@fastcampus.com"));
        System.out.println("findUserByEmail" + userRepository.findUserByEmail("martin@fastcampus.com"));
        System.out.println("findSomethingByEmail" + userRepository.findSomethingByEmail("martin@fastcampus.com"));
    }
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
findByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
getByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
readByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
queryByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
searchByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
streamByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
findUserByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:19:31.587805, updatedAt=2021-10-17T20:19:31.587805)
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=?
findSomethingByEmailUser(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:24:24.382276, updatedAt=2021-10-17T20:24:24.382276)
```
###### ``...First<number>...``, ``...Top<number>...``
- 상위의 지정된 개수의 레코드만 추출
- First와 Top의 차이가 없음
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findFirst2ByName(String name);
    List<User> findTop2ByName(String name);
}
```
```java
@Test
void select() {
    System.out.println("findFirst2ByName" + userRepository.findFirst2ByName("martin"));
    System.out.println("findTop2ByName" + userRepository.findTop2ByName("martin"));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.name=? limit ?
findFirst2ByName[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:40:42.929346, updatedAt=2021-10-17T20:40:42.929346), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-17T20:40:42.935346, updatedAt=2021-10-17T20:40:42.935346)]
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.name=? limit ?
findTop2ByName[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-17T20:40:42.929346, updatedAt=2021-10-17T20:40:42.929346), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-17T20:40:42.935346, updatedAt=2021-10-17T20:40:42.935346)]
```
- Last란 키워드는 존재하지 않음
  - "List<User> findLast1ByName(String name);"은 findByName과 동일
  - Last record를 가져오고 싶으면, order by를 이용해서 역순 정렬 후, First 또는 Top을 사용

#### Query predicate keywords
###### AND
- Where절에 and 조건을 삽입
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailAndName(String email, String name);
}
```
```java
@Test
void select() {
    System.out.println("findByEmailAndName" + userRepository.findByEmailAndName("martin@fastcampus.com", "martin"));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=? 
        and user0_.name=?
findByEmailAandName[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T16:42:52.255971, updatedAt=2021-10-24T16:42:52.255971)]
```
###### Or
- Where절에 or 조건을 삽입
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailOrName(String email, String name);
}
```
```java
@Test
void select() {
    System.out.println("findByEmailOrName" + userRepository.findByEmailOrName("martin@fastcampus.com","dennis"));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.email=? 
        or user0_.name=?
findByEmailOrName[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T17:09:50.258286, updatedAt=2021-10-24T17:09:50.258286), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T17:09:50.264287, updatedAt=2021-10-24T17:09:50.264287)]
```
###### Before, After
- Where절에 시간에 대한 조건을 삽입
- 특정 시간 이후의 해당하는 레코드를 추출
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByCreatedAtAfter(LocalDateTime yesterday);
}
```
```java
@Test
void select() {
    System.out.println("findByCreatedAtAfter" + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1)));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.created_at>?
findByCreatedAtAfter[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T17:28:43.991237, updatedAt=2021-10-24T17:28:43.991237), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T17:28:43.996241, updatedAt=2021-10-24T17:28:43.996241), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T17:28:43.997240, updatedAt=2021-10-24T17:28:43.997240), User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-24T17:28:43.997240, updatedAt=2021-10-24T17:28:43.997240), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T17:28:43.997240, updatedAt=2021-10-24T17:28:43.997240)]
```
- 날짜와 시간이 아닌 칼럼에도 사용 가능
  - 가독성을 위해서 날짜와 시간 칼럼에만 사용하는 것이 좋음
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdAfter(Long id);
}
```
```java
@Test
void select() {
    System.out.println("findByIdAfter" + userRepository.findByIdAfter(4L));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id>?
findByIdAfter[User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T18:12:15.933276, updatedAt=2021-10-24T18:12:15.933276)]
```
###### GreaterThan, GreaterThanEqual, LessThan, LessThanaEqual
- Where절에 크기 비교 조건을 삽입
- 숫자와 날짜, 시간 칼럼에 사용 가능
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);
    List<User> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);
}
```
```java
@Test
void select() {
    System.out.println("findByCreatedAtGreaterThan" + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1)));
    System.out.println("findByCreatedAtGreaterThanEqual" + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1)));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.created_at>?
findByCreatedAtGreaterThan[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T18:20:37.703211, updatedAt=2021-10-24T18:20:37.703211), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T18:20:37.709203, updatedAt=2021-10-24T18:20:37.709203), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T18:20:37.710203, updatedAt=2021-10-24T18:20:37.710203), User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-24T18:20:37.710203, updatedAt=2021-10-24T18:20:37.710203), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T18:20:37.710203, updatedAt=2021-10-24T18:20:37.710203)]
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.created_at>=?
findByCreatedAtGreaterThanEqual[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T18:26:51.268171, updatedAt=2021-10-24T18:26:51.268171), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T18:26:51.273173, updatedAt=2021-10-24T18:26:51.273173), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T18:26:51.273173, updatedAt=2021-10-24T18:26:51.273173), User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-24T18:26:51.273173, updatedAt=2021-10-24T18:26:51.273173), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T18:26:51.273173, updatedAt=2021-10-24T18:26:51.273173)]
```
###### Between
- Where절에 Between 조건을 삽입
- 숫자와 날짜, 시간 칼럼에 사용 가능
- 양끝의 경계값들을 포함
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tommorrow);
    List<User> findByIdBetween(Long id1, Long id2);
}
```
```java
@Test
void select() {
    System.out.println("findByCreatedAtBetween" + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1)));
    System.out.println("findByIdBetween" + userRepository.findByIdBetween(1L, 3L));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.created_at between ? and ?
findByCreatedAtBetween[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T18:33:21.698985, updatedAt=2021-10-24T18:33:21.698985), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T18:33:21.702984, updatedAt=2021-10-24T18:33:21.702984), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T18:33:21.703983, updatedAt=2021-10-24T18:33:21.703983), User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-24T18:33:21.703983, updatedAt=2021-10-24T18:33:21.703983), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T18:33:21.703983, updatedAt=2021-10-24T18:33:21.703983)]
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id between ? and ?
findByIdBetween[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T18:33:21.698985, updatedAt=2021-10-24T18:33:21.698985), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T18:33:21.702984, updatedAt=2021-10-24T18:33:21.702984), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T18:33:21.703983, updatedAt=2021-10-24T18:33:21.703983)]
```
- findByXXGreaterThanEqualAndXXLessThanEqual()을 이용하여 동일한 결과를 생성 가능
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);
}
```
```java
@Test
void select() {
    System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual" + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id>=? 
        and user0_.id<=?
findByIdGreaterThanEqualAndIdLessThanEqual[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T18:38:40.754898, updatedAt=2021-10-24T18:38:40.754898), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T18:38:40.759903, updatedAt=2021-10-24T18:38:40.759903), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T18:38:40.759903, updatedAt=2021-10-24T18:38:40.759903)]
```
###### IsNotNull, IsNull
- 칼럼의 Null 체크 기능
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdIsNotNull();
}
```
```java
@Test
void select() {
    System.out.println("findByIdIsNotNull" + userRepository.findByIdIsNotNull());
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_0_,
        user0_.created_at as created_2_0_,
        user0_.email as email3_0_,
        user0_.name as name4_0_,
        user0_.updated_at as updated_5_0_ 
    from
        user user0_ 
    where
        user0_.id is not null
findByIdIsNotNull[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T19:41:18.854301, updatedAt=2021-10-24T19:41:18.854301), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T19:41:18.860304, updatedAt=2021-10-24T19:41:18.860304), User(id=3, name=sophia, email=sophia@slowcampus.com, createdAt=2021-10-24T19:41:18.861303, updatedAt=2021-10-24T19:41:18.861303), User(id=4, name=james, email=james@slowcampus.com, createdAt=2021-10-24T19:41:18.861303, updatedAt=2021-10-24T19:41:18.861303), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T19:41:18.861303, updatedAt=2021-10-24T19:41:18.861303)]
```
###### IsNotEmpty, IsEmpty
- Collection properties에만 사용가능 (1:N관계에서 사용)
- where절에 exist와 inner select query를 사용
```java
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private Long id;
}

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;
}
```
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAddressIsNotEmpty();
}
```
```java
@Test
void select() {
    System.out.println("findByAddressIsNotEmpty" + userRepository.findByAddressIsNotEmpty());
}
```
```sql
Hibernate: 
    
    create table address (
       id bigint not null,
        primary key (id)
    )
Hibernate: 
    
    create table user (
       id bigint not null,
        created_at timestamp,
        email varchar(255),
        name varchar(255),
        updated_at timestamp,
        primary key (id)
    )
Hibernate: 
    
    create table user_address (
       user_id bigint not null,
        address_id bigint not null
    )

Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        exists (
            select
                address2_.id 
            from
                user_address address1_,
                address address2_ 
            where
                user0_.id=address1_.user_id 
                and address1_.address_id=address2_.id
        )
findByAddressIsNotEmpty[]
```
###### In, NotIn
- where절의 In절 생성
- Or 조건을 여러번 사용한 것과 동일
- In절을 위해서 사용하는 List의 데이터 개수가 너무 많으면, 성능에 악영향
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameIn(List<String> names);
}
```
```java
@Test
void select() {
    System.out.println("findByNameIn" + userRepository.findByNameIn(Arrays.asList("martin", "dennis")));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name in (
            ? , ?
        )
findByNameIn[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:10:55.684966, updatedAt=2021-10-24T20:10:55.684966), User(id=2, name=dennis, email=dennis@fastcampus.com, createdAt=2021-10-24T20:10:55.689965, updatedAt=2021-10-24T20:10:55.689965), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:10:55.690966, updatedAt=2021-10-24T20:10:55.690966)]
```
###### StartingWith, EndingWith, Contains
- where절의 like절 생성
- 문자열의 매칭 레코드를 검색
- ``findByXXXLike(String XXX)``메소드를 한번 더 Wrapping한 메소드
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameStartingWith(String name);
    List<User> findByNameEndingWith(String name);
    List<User> findByNameContains(String name);
    List<User> findByNameLike(String name);
}
```
```java
@Test
void select() {
    System.out.println("findByNameStartingWith" + userRepository.findByNameStartingWith("mar"));
    System.out.println("findByNameEndingWith" + userRepository.findByNameEndingWith("tin"));
    System.out.println("findByNameContains" + userRepository.findByNameContains("art"));
    System.out.println("findByNameLike" + userRepository.findByNameLike("mar%"));
    System.out.println("findByNameLike" + userRepository.findByNameLike("%tin"));
    System.out.println("findByNameLike" + userRepository.findByNameLike("%art%"));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name like ? escape ?
findByNameStartingWith[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:18:34.199183, updatedAt=2021-10-24T20:18:34.199183), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:18:34.206184, updatedAt=2021-10-24T20:18:34.206184)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name like ? escape ?
findByNameEndingWith[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:18:34.199183, updatedAt=2021-10-24T20:18:34.199183), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:18:34.206184, updatedAt=2021-10-24T20:18:34.206184)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name like ? escape ?
findByNameContains[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:18:34.199183, updatedAt=2021-10-24T20:18:34.199183), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:18:34.206184, updatedAt=2021-10-24T20:18:34.206184)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name like ? escape ?
findByNameLike[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:23:30.263708, updatedAt=2021-10-24T20:23:30.263708), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:23:30.270711, updatedAt=2021-10-24T20:23:30.270711)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name like ? escape ?
findByNameLike[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:23:30.263708, updatedAt=2021-10-24T20:23:30.263708), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:23:30.270711, updatedAt=2021-10-24T20:23:30.270711)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name like ? escape ?
findByNameLike[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:23:30.263708, updatedAt=2021-10-24T20:23:30.263708), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:23:30.270711, updatedAt=2021-10-24T20:23:30.270711)]
```
###### Is
- ``Is, Equals, (or no keyword)`` 동일 
- where 절에 ``=`` 을 생성
- 일치하는 레코드를 가져옴
```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameIs(String name);
    List<User> findByNameEquals(String name);
    List<User> findByName(String name);
}
```
```java
@Test
void select() {
    System.out.println("findByNameIs" + userRepository.findByNameIs("martin"));
    System.out.println("findByNameEquals" + userRepository.findByNameEquals("martin"));
    System.out.println("findByName" + userRepository.findByName("martin"));
}
```
```sql
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name=?
findByNameIs[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:32:38.680171, updatedAt=2021-10-24T20:32:38.680171), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:32:38.690175, updatedAt=2021-10-24T20:32:38.690175)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name=?
findByNameEquals[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:32:38.680171, updatedAt=2021-10-24T20:32:38.680171), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:32:38.690175, updatedAt=2021-10-24T20:32:38.690175)]
Hibernate: 
    select
        user0_.id as id1_1_,
        user0_.created_at as created_2_1_,
        user0_.email as email3_1_,
        user0_.name as name4_1_,
        user0_.updated_at as updated_5_1_ 
    from
        user user0_ 
    where
        user0_.name=?
findByName[User(id=1, name=martin, email=martin@fastcampus.com, createdAt=2021-10-24T20:32:38.680171, updatedAt=2021-10-24T20:32:38.680171), User(id=5, name=martin, email=martin@another.com, createdAt=2021-10-24T20:32:38.690175, updatedAt=2021-10-24T20:32:38.690175)]
```
