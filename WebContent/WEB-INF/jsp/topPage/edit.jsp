<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<portlet:defineObjects />
<form method="post" action="<portlet:actionURL />">
	<p>topページ用HTML</p>
	<textarea name="html" rows="25" cols="50">${html}</textarea>
	<input type="submit" />
</form>
