<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:url  var="varUrl" value="/sede/form.html"/>
<form:form method="post" modelAttribute="sedeForm" action = "${varUrl}">
<h1><c:out value = "${message}" /></h1>
<form:input path="descrizione" type="text" />
<input type="submit" value="Aggiungi"/>

</form:form>