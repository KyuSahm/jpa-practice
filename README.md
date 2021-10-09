# JPA (Java Persistence API)

## IntelliJ

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

### Spring Initializer 생성방법

1. "https://start.spring.io/"에 접속
2. "Gradle Project" 선택
3. Language "Java" 선택
4. Spring Boot에서 버전 선택
5. Articfact에 프로젝트 이름 기입
6. Packaging에서 "Jar" 선택
7. Java Version 선택
8. 우측의 Dependency 추가 - Lombok, Spring Web
9. Generate
10. Zip 파일 생성
11. Explorer를 선택해서, 상세 정보 확인 가능
12. Zip파일의 압축을 푼 후, 내용을  Workspace로 복사
13. IntelliJ의 Open Project에서 build.gradle 파일을 선택해서 Open
14. Run 명령어를 실행



## Lombok

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

- "https://www.daleseo.com/lombok-popular-annotations/" 참조

###### @Data

- `@Getter`, `@Setter`, `@RequiredArgsConstructor`, `@ToString`, `@EqualsAndHashCode`을 한꺼번에 설정



## Swagger

- Maven Repository에서 "[SpringFox Boot Starter](https://mvnrepository.com/artifact/io.springfox/springfox-boot-starter) " 검색

#### build.gradle 설정

```gradle
implementation group: 'io.springfox', name: 'springfox-boot-starter', version: '3.0.0'
```

#### 동작 확인

- "http://localhost:8080/swagger-ui/"에 접속하여 확인

 