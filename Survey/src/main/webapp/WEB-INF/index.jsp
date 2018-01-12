<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">	
		<script src="/js/main.js"></script>
	</head>

	<body>
			<fieldset>

					<form action="/submit" method="post">
						<label >Your Name
							<input type="text" name="name">
						</label>
						<label >Location
							<select name="location">
								<option value="washington">Washington D.C</option>
								<option value="seatle">Seatle</option>
								<option value="SanJose">San Jose</option>
							</select>
						</label>
						<label >Favoirte Language
							<select name="stack">
								<option value="java">Java</option>
								<option value="mean">MEan</option>
								<option value="python">Python</option>
							</select>
						</label>
						<label >Comment (Optional)
							<textarea name="comment" id="" cols="30" rows="10"></textarea>
						</label>
						<input type="submit" value="Create survey">
					</form>
				</fieldset>
	</body>
</html>