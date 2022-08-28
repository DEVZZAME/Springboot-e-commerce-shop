# zzameshop

이커머스를 활용하여 제작된 글로세리 쇼핑몰입니다.




# Description

- 개발 기간: 2022.03.20 ~ 2022.05.10 (약 8주)

- 참여 인원: 1인 개발

- 사용 기술

  - Spring Boot 2.5.2, Querydsl-JPA 4.3.1, OAuth2.0, Maven 1.1.3
  - Java 11,  Ajax,  Jquery,  Git,  MVC Pttern
  - MySQL, Modelmapper 2.3.9, Thymeleaf 2.5.1
  - HTML5, CSS3, Javascript, 

- 담당 구현 파트

  - 프로젝트 개발환경 구축, 설계 참여

  - 메인 페이지 구현

  - Header 메인 메뉴 디자인 및 구성(검색)
  
  - 상품 등록 페이지 구현(상품 상태, 상품 설명, 상품 이미지 업로드)
  
  - 상품 관리 페이지 구현(상품 리스트, 페이징, 검색)

  - 상품 상세 페이지 구현 (수량에 따른 가격증가, 좋아요, 장바구니, 주문하기)
  
  - 상품 구매이력 페이지 구현(주문일시, 페이징, 주문취소)

  - GitHub 레포지토리 전체 관리

    

# Views

- **회원가입 및 메인**

  <p align="center"><img src="https://github.com/DEVZZAME/zzameshop/blob/master/01.gif?raw=true"/></p>





- **상품 관리** 

<p align="center"><img src="https://github.com/DEVZZAME/zzameshop/blob/master/02.gif?raw=true"/></p>





- **상품 등록**

<p align="center"><img src="https://github.com/DEVZZAME/zzameshop/blob/master/03.gif?raw=true"/></p>





- **장바구니 및 로그아웃**

<p align="center"><img src="https://github.com/DEVZZAME/zzameshop/blob/master/04.gif?raw=true"/></p>





# Spring Boot(API Server)

---

> JSP(MAP)에서 요청한 데이터를 JSON으로 response 합니다.
> 
- config : project configurations를 관리 합니다.
- domain : 실제 DB에서 테이블과 매핑 합니다.
- handler : custom exception message를 관리하고 aop를 이용해 validation 검사를 자동화 합니다.
- service : business logic 처리 합니다.
- util : 공통응답을 위한 util 기능들을 관리 합니다.
- web
    - dto : 일반적인 request/response dto와 공통응답을 위한 dto를 관리 합니다.
    - api : data를 응답할 controller를 관리 합니다.

