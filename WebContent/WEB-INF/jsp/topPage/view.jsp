<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>

<portlet:defineObjects />
<%
	String user = request.getRemoteUser();
	if ("root".equals(user)) {
		out.println(user);
%>
<a href="<portlet:renderURL portletMode="edit" />">Edit Mode</a>
<%
	}
%>
${html}
