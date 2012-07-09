<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<portlet:defineObjects />
<portlet:renderURL var="viewListURL" />
<form>
	<p>logページ view</p>
	<p>ログファイル : ${filePath}</p>

	<display:table name="list" sort="external" defaultsort="1"
		requestURI="${viewListURL}" pagesize="20" id="element">
		<display:column property="lineNumber" title="LN" sortable="true"
			sortName="lineNumber" style="color: red;" />
		<display:column property="timestamp" title="TS" />
		<display:column property="prefixMdc" title="PM" style="color: red;" />
		<display:column property="level" title="LV" sortable="true"
			sortName="level" />
		<display:column property="category" title="CG" style="color: red;" />
		<display:column property="thread" title="TH" />
		<display:column property="message" title="MS" style="color: red;" />
	</display:table>

</form>
