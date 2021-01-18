<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>-
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>하이텍코리아</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery-3.5.1.min.js"></script>
<script src="default.js"></script>

<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>

<script>

jQuery(document).ready(function($) {

$("#productBtn").click(function(event){            

event.preventDefault();

$('html,body').animate({scrollTop:$(this.hash).offset().top}, 500);

});

});

</script>




<body>
    <div id="wrapper">
        <jsp:include page="top.jsp" flush="true"/>
        <div id="extra" class="container">
            <div class="title">
                <h2 style="font-family=:'NanumSquareBold'">찾아오시는 길</h2>
            </div>
            <!-- * 카카오맵 - 지도퍼가기 -->
            <!-- 1. 지도 노드 -->
            <div id="daumRoughmapContainer1610604042508" class="root_daum_roughmap root_daum_roughmap_landing" style="margin:0 auto; "></div>

            <!--
                2. 설치 스크립트
                * 지도 퍼가기 서비스를 2개 이상 넣을 경우, 설치 스크립트는 하나만 삽입합니다.
            -->
            <script charset="UTF-8" class="daum_roughmap_loader_script" src="https://ssl.daumcdn.net/dmaps/map_js_init/roughmapLoader.js"></script>

            <!-- 3. 실행 스크립트 -->
            <script charset="UTF-8">
                new daum.roughmap.Lander({
                    "timestamp" : "1610604042508",
                    "key" : "23wej",
                    "mapWidth" : "640",
                    "mapHeight" : "360"
                }).render();
            </script>

        </div>
    </div>
    <jsp:include page="footer.jsp" flush="true"/>
</body>
</html>
