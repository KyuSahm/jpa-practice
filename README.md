# JPA (Java Persistence API)

- JPA의 개념
  - https://velog.io/@adam2/JPA%EB%8A%94-%EB%8F%84%EB%8D%B0%EC%B2%B4-%EB%AD%98%EA%B9%8C-orm-%EC%98%81%EC%86%8D%EC%84%B1-hibernate-spring-data-jpa
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

#### 단축키 (Short Key)

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
- Quick Definition: Ctrl + Shift + i
  - 사용하고 있는 메소드 명에서 키를 누르면, 정의된 메소드의 선언부를 미리보기 할 수 있음.
- Quick Document: Ctrl + Q     
  - 사용하고 있는 메소드 명에서 키를 누르면, 정의된 메소드의 선언부의 API 정보를 볼 수 있음.
  - Java Doc으로 기록한 정보를 보여줌
- Java Doc 양식 생성: 메소드의 위에서 "/**"을 입력한 후, Enter 키 입력
- 기능(action) 찾기: Ctrl + Shift + A
  - 단축키 정보를 찾을 수 있음
  - Help > Keymap Reference: 단축키 문서를 보여줌.

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
- 커스텀 단축키 추가
  - shift Key를 두번 눌러 Keymap 검색
  - Configure Keymap 선택
  - "split" 검색 후, 해당 메뉴 선택
  - 마우스 오른쪽 키 눌러서, "add keyboard shortcut"

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

 