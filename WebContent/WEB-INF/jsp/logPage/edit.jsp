<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<portlet:defineObjects />
<form method="post" action="<portlet:actionURL />">
	<p>logページ edit</p>
	<p>
		ログファイル : ${filePath}<br /> <input type="text" name="filePath"
			value="${filePath}" size="100" />
	</p>
	<p>
		log4jPattern<br /> <input type="text" name="log4jPattern"
			value="${log4jPattern}" size="100" />
	</p>
	<input type="submit" />
	<hr />
	server.log
	<table border="1">
		<tr>
			<td>ローカル</td>
			<td>C:\GateIn-3.3.0-GA-jbossas7\standalone\log\server.log</td>
		</tr>
		<tr>
			<td>リモート</td>
			<td>/var/lib/stickshift/3216d1010d7541b48a77a9b02fa6e9eb/portal/jbossas-7/standalone/log/server.log</td>
		</tr>
	</table>
	<br /> log4jPattern:JBoss独自仕様(%s%E)はメッセージ(%m)として扱う
	<table border="1">
		<tr>
			<td>ローカル</td>
			<td>%d{HH:mm:ss,SSS} %-5p [%c] (%t) %m%n</td>
		</tr>
		<tr>
			<td>リモート</td>
			<td>%d{yyyy/MM/dd HH:mm:ss,SSS} %-5p [%c] (%t) %m%n</td>
		</tr>
	</table>
</form>
