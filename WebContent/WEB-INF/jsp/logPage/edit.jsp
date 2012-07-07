<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<portlet:defineObjects />
<form method="post" action="<portlet:actionURL />">
	<p>logページ edit</p>
	<p>ログファイル : ${filePath}</p>
	<input type="text" name="filePath" value="${filePath}" size="100" /> <input
		type="submit" />
</form>
