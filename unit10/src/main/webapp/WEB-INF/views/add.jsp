<%@ page session="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.*" %>
<%@page import="java.text.*" %>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" type="text/css"
	href="/address/resources/css/common.css" />
<title>住所録(初期画面)</title>
</head>
<body>
	<form:form modelAttribute="salesSystemForm" action="/sales/system">
		<div class="header">
			<span class="titleName">山田オンラインショップ </span>
			<%
		      GregorianCalendar cal = new GregorianCalendar();
		      SimpleDateFormat format = new SimpleDateFormat("M月d日 E曜日");
		      String datestr = format.format(cal.getTime());
		    %>
			<%=datestr%>
		</div>
		<div class="main">
			<div>
				<div>
				${list.name}
				</div>
				<span class="itemName">
				点数:<input type="text" name="ten" value="1" />
				</span>
			</div>
		</div>
		<div class="footer">
			<div>
				<input type="submit" name="add" value="明細参照" />
			</div>
		</div>
		<div class="footer">
			<input type="submit" name="toInit" value="戻る" />
		</div>
	</form:form>
</body>
</html>