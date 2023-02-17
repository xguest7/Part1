<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<hr>
- jdk 8 설치
- sts3 설치 (작업 문자셋변경 utf8, lombok 추가설치)

->spring legacy (Spring MVC 프로젝트)
-기본서버 삭제후 tomcat9로 설정

pom.xml에서 작업
1.스프링프레임워크 버전 5.0.7 높임
2.lombok 라이브러리 추가 1.18.0
3.자바 버전 변경 1.8
4.log4j 버전 업 1.2.17 (어디서든 사용하기 위해서 추가설정 다 삭제)
5.junit 버전 업 4.12
6.스프링테스트 추가 

서버로 돌리면 기본화면이 출력됨

의존성 주입(DI-dependency injection)
해당하는 객체가 필요한 경우 스프링에서 객체를 생성해서 넣어준다.
스프링에서 해당하는 객체를 인식시켜야 한다.
인식을 시키기 위해서는 1. @Componet 붙여서
                       2. 해당 패키지를 scan (root-context.xml에서 설정)
      ->스프링에서 인식된 객체를 Spring bean
주입시에는 DI 필요할 경우 주입하라고 @Autowired 붙여줘야한다.

junit 테스트시에 스프링프레임워크를 이용해서 테스트 하도록
해줘야지만 DI가 적용된다. 

의존성을 주입할때 3가지 방법이 있다.
1.필드(Field) 주입(DI)
2.수정자(Setter) 주입(DI)
3.생성자(Constructor) 주입(DI)     

</body>
</html>













