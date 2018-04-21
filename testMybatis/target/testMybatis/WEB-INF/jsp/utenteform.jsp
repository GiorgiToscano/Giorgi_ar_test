
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/test.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
	<c:url var="varUrl" value="/utente/new.html" />

	<div>
		<h1>Nuovo Utente</h1>
		<form:form method="post" modelAttribute="userForm" action="${varUrl}">
			<form:label path="nome">Nome:</form:label>
			<br>
			<form:input path="nome" type="text"
				style="margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="cognome">Cognome:</form:label>
			<br>
			<form:input path="cognome" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="codiceFiscale">Codice Fiscale:</form:label>
			<br>
			<form:input path="codiceFiscale" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="email">Email:</form:label>
			<br>
			<form:input path="email" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="username">Username:</form:label>
			<br>
			<form:input path="username" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="password">Password:</form:label>
			<br>
			<form:input path="password" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="ripetiPassword">Ripeti Password:</form:label>
			<br>
			<form:input path="ripetiPassword" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<form:label path="tipologia">Tipologia:</form:label>
			<br>
			<form:input path="tipologia" type="text"
				style=" margin: 0 auto;  text-align:left; width:100%;" />
			<br>

			<br>
			<input class="btn btn-lg btn-success" type="submit" value="Aggiungi" />
		</form:form>
	</div>

</body>
</html>