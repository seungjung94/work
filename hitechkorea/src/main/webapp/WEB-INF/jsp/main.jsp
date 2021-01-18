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
        </div>
    </div>
    <jsp:include page="footer.jsp" flush="true"/>
</body>
</html>
