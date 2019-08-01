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
<title>売上システム(参照画面)</title>
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
					<span class="itemName">商品:</span>
					<form:select path="goodsName" items="${nameList}" />
				</div>
				<div>
					<span class="itemnum">点数:</span>
					<form:input path="point" value="${point}" />
				</div>
				<input type="submit" name="add" value="明細追加" />
			</div>
			<br>
				<font color=#ff0000><c:out value="${message1}" /></font>
				<font color=#0000ff><c:out value="${message2}" /></font>
			<br>
		</div>

		<table border="1">
			<caption>売上詳細</caption>
			<tr>
				<th>削除</th>
				<th>商品ＩＤ</th>
				<th>商品名</th>
				<th>単価</th>
				<th>点数</th>
				<th>小計</th>
			</tr>

			<c:forEach items="${AllList}" var="AllList"  varStatus="loop">
				<tr>
					<td><form:radiobutton path="delNumber" value="${loop.count}"/></td>
					<td>${AllList.id}</td>
					<td>${AllList.name}</td>
					<td>${AllList.price}</td>
					<td>${AllList.quantity}</td>
					<td>${AllList.subtotal}</td>
				</tr>
			</c:forEach>
		</table>
		  合計： <c:out value="${total}" /> 円
		<div class="footer">
			<input type="submit" name="delete" value="削除" />
			 <input type="submit" name="firm" value="確定">
		</div>

	</form:form>
</body>
</html>

