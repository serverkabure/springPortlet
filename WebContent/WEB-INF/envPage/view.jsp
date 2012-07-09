<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>

<portlet:defineObjects />
<p>環境変数</p>
<table border="1">
	<tr>
		<th>key</th>
		<th>value</th>
	</tr>
	<%
		Map<String, String> model = (Map<String, String>) request
				.getAttribute("model");
		for (Map.Entry<String, String> entry : model.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
	%>
	<tr>
		<td><%=key%></td>
		<td><%=(value == null ? "&nbsp;" : value)%></td>
	</tr>
	<%
		}
	%>
</table>
