<%@ page session="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/sales/resources/css/common.css" />
<title>売上システム(初期画面)</title>
</head>
<body>
	<form:form modelAttribute="salesForm" action="/sales/system">
		<div class="header">
			<span class="titleName">牧野オンラインシステム</span>
			<%
				GregorianCalendar cal = new GregorianCalendar();
					SimpleDateFormat format = new SimpleDateFormat("M月d日 (E)");
					String datestr = format.format(cal.getTime());
			%>
			<%=datestr%>
		</div>
		<div class="main">
			<div class="footer">
				<div>
					商品:
					<form:select path="goodsName" items="${nameList}" />
				</div>
				<div>
					<span class="itemnum">点数:</span>
					<form:input path="point" value="${point}" />
				</div>
				<input type="submit" name="add" value="明細追加" />
			</div>
		</div>
		<font color=#ff0000><c:out value="${message1}" /></font>
		<font color=#0000ff><c:out value="${message2}" /></font>
	</form:form>
</body>
</html>