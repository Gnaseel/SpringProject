Spring Project
===

### 1. Project Objective

Spring Framework의 구조를 이해하기 위해 간단한 CRUD 기능이 있는 게시판을 만들어 본다.
처음으로 진행한 웹 프로젝트이기 때문에 다양한 범위에서 다양한 기능을 구현하기 보다는,
정해진 범위 이내에서 depth를 챙기는 것을 우선으로 진행했다.
### 

### 2. 개발 환경

#### &nbsp;&nbsp;2.1 Languague  
<a href="url"><img src="/images/java.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/jsp.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/javaScript.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/html.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/css.png" widgth="100" height="100"></a>  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
#### &nbsp;&nbsp;2.2 Framework & Library  

<a href="url"><img src="/images/spring.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/jquery.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/bootStrap.jfif" widgth="100" height="100"></a>
<a href="url"><img src="/images/summerNote.png" widgth="100" height="100"></a>  

#### &nbsp;&nbsp;2.3 DataBase  

<a href="url"><img src="/images/oracle.png" widgth="100" height="100"></a>  

#### &nbsp;&nbsp;2.4 ETC  

<a href="url"><img src="/images/jira.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/git.png" widgth="100" height="100"></a>
<a href="url"><img src="/images/gcp.png" widgth="100" height="100"></a>  

### 3. Key Summary

#### &nbsp;&nbsp;3.1 웹 소켓을 이용한 실시간 알람 구현

[사진]

웹 소켓을 이용해서 실시간 알람을 구현했다.
특정 client에게 전송해야 할 데이터가 있으면 client의 request 없이 server가 먼저 client에게 데이터를 전송한다.  
본 프로젝트에서는 댓글 알람에만 웹 소켓 기능을 이용했지만 프로젝트의 특성에 따라서 실시간 채팅 기능을 구현하는 것도 가능하다.  

#### &nbsp;&nbsp;3.2 구글 계정 연동

#### &nbsp;&nbsp;&nbsp;&nbsp;3.2.1. Oauth

[사진]

Oauth 인증을 사용해서 구글 계정에 접속할 수 있다.  
Access token을 발급받고, 만료된 경우 Refresh token으로 재발급 받는 과정이 자동으로 진행되게 구현했다.

#### &nbsp;&nbsp;&nbsp;&nbsp;3.2.2. Google cloud service(calendar)

[사진]

GCP의 여러 기능 중에서 caledar 기능을 이용했다.  
게시글에서 공지된 시간 정보를 얻어 해당 캘린더에 일정을 추가해준다.  

#### &nbsp;&nbsp;3.3 SHA방식 패스워드 해싱

[사진]

SHA-256을 사용해서 패스워드를 해싱한 후 서버에 전송해서, 중간에 패킷이 탈취되어도 원래 패스워드는 알지 못한다.  
다음 프로젝트에서는 비대칭키 방식을 사용해서 보안을 조금 더 강화하고 싶다.  

#### &nbsp;&nbsp;3.4 파일 입출력 및 이미지 미리보기

[사진]

게시글에 파일을 첨부할 수 있고, 이미지를 첨부할 경우 미리보기 기능을 제공한다.  

#### &nbsp;&nbsp;3.5 AJAX를 이용한 댓글, 게시글 작성

[]

댓글이나 게시글을 작성할 때 새로고침이나 앞뒤 이동으로 컨텐츠가 중복 생성되는 것을 방지하기 위해서  
AJAX를 이용해 구현했다.  

#### &nbsp;&nbsp;3. Jira를 이용한 Kanban방식

[]

프로젝트 중간 부분부터 계획없는 개발에 단점이 부각되어 근본적인 부분부터 다시 세워가며 개발을 하기위해 Kanban방식을 도입했다.  
매 주 첫날 업무 목록을 만들고, 업무 목록의 중요도나 긴급도를 파악해서 매일매일 할당된 만큼 개발을 진행했다.

### 3. Folder structure 
### 4. DB 구조 (릴레이션 스키마)
<a href="url"><img src="/images/erd.png" width="1000" height="800"></a>
### 5. 클래스 및 패키지 구조

#### &nbsp;&nbsp;5.1 ClassDiagram
<a href="url"><img src="/images/classDiagram.png" width="1000" height="800"></a>
### 6. 유닛테스트 
#### &nbsp;&nbsp;6.1 code coverage

### 7. 개선 가능한 기능
#### &nbsp;&nbsp;7.1 Cache 기능
즉각적인 반영이 필요없는 일부 데이터를 캐싱해서 사용하여 DB접근 횟수를 줄이고, 최적화 할 수 있다.
#### &nbsp;&nbsp;7.2 보안 기능 강화
SQL injection, XSS, CSRF등 front단에서 추가적으로 보안 확보 가능
#### &nbsp;&nbsp;7.3 실제 배포
로컬 환경이 아닌 실제 서버에 배포하는 과정
