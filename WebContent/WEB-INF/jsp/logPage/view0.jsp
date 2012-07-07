<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<portlet:defineObjects />
<form>
	<p>logページ view</p>
	<p>ログファイル : ${filePath}</p>
	<table border="1">
		<tr>
			<th>LN</th>
			<th>TS</th>
			<th>PM</th>
			<th>LV</th>
			<th>CG</th>
			<th>TH</th>
			<th>MS</th>
		</tr>
		<c:forEach var="lmo" items="${list}">
			<tr>
				<td>${lmo.lineNumber}</td>
				<td>${lmo.timestamp}</td>
				<td>${lmo.prefixMdc}</td>
				<td>${lmo.level}</td>
				<td>${lmo.category}</td>
				<td>${lmo.thread}</td>
				<td>${lmo.message}</td>
			</tr>
		</c:forEach>
	</table>
</form>
