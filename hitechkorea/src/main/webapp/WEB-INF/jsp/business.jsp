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
            <div class="sidebar">
                <p>사업영역</p><hr>
                <p>주유기부품</p><hr>
                <p>위험물탱크청소</p><hr>
                <p>누출검사</p><hr>
                <p>위험물공사/탱크보수</p><hr>
                <p>유증기검사</p><hr>
                <p>폐기물수집운반</p>
            </div>
            <div class="content">
                <h2>제품소개</h2>
                <div id="three-column">
                    <div class="boxA">
                        <div class="box"></span>
                            <p class="title-k">호스 스위벨(-자)</p>
                        </div>
                    </div>
                    <div class="boxB">
                        <div class="box"></span>
                            <p class="title-k">안전밸브</p>
                        </div>
                    </div>
                    <div class="boxA">
                        <div class="box"></span>
                            <p class="title-k">호스 스위벨 커플링</p>
                        </div>
                    </div>
                    <div class="boxA">
                        <div class="box"></span>
                            <p class="title-k">스파우트</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp" flush="true"/>
</body>
</html>
