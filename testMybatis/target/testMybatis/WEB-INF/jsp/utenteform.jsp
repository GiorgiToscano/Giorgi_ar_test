
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/bootstrap.min.css"/>"
	rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-theme.min.css"/>"
	rel="stylesheet" type="text/css">
</head>
<body>
	<c:url var="varUrl" value="/utente/new.html" />

	<div class="container theme-showcase" role="main"
		style="border: 0px dotted;">
		<div class="jumbotron">
			<h3 class="form-signin-heading">AREA RISERVATA - REGISTRAZIONE</h3>
			<br />
			<form:form class="form-vertical" method="post"
				modelAttribute="userForm" action="${varUrl}">
				<c:if test="${errors == true}">
					<div class="alert alert-danger">
					    <h3>Errori: </h3>
						<form:errors path="*" />
					</div>
				</c:if>
				<div class="form-group">
					<form:label for="name" path="nome">Nome</form:label>
					<div>
						<form:input id="name" class="form-control" path="nome"
							placeholder="Inserisci il tuo nome" type="text"
							style="margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>

				<div class="form-group">
					<form:label for="surname" path="cognome">Cognome</form:label>
					<div>
						<form:input id="surname" class="form-control" path="cognome"
							placeholder="Inserisci il tuo cognome" type="text"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
						<form:errors path="nome" />
					</div>
				</div>

				<div class="form-group">
					<form:label for="codfis" path="codiceFiscale">Codice Fiscale</form:label>
					<div>
						<form:input id="codfis" class="form-control" path="codiceFiscale"
							placeholder="Codice Fiscale" type="text"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>

				<div class="form-group">
					<form:label for="email" path="email">Email</form:label>
					<div>
						<form:input id="email" class="form-control" path="email"
							placeholder="xxxxxx@iisgiorgimilano.gov.it" type="text"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>

				<div class="form-group">
					<form:label for="username" path="username">Username</form:label>
					<div>
						<form:input id="username" class="form-control" path="username"
							type="text" placeholder="Username"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>
				<div class="form-group">
					<form:label for="pwd" path="password">Password</form:label>
					<div>
						<form:input id="pwd" class="form-control" path="password"
							type="text" placeholder="Password"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>

				<div class="form-group">
					<form:label for="rippwd" path="ripetiPassword">Ripeti Password</form:label>
					<div>
						<form:input id="rippwd" class="form-control" path="ripetiPassword"
							type="text" placeholder="Ripeti password"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>

				<div class="form-group">
					<form:label for="tip" path="tipologia">Tipologia</form:label>
					<div>
						<form:input id="tip" class="form-control" path="tipologia"
							type="text"
							style=" margin: 0 auto;  text-align:left; width:100%;" />
					</div>
				</div>

				<br>
				<input class="btn btn-lg btn-success" type="submit" value="Registra" />
			</form:form>
		</div>
	</div>

</body>
</html>