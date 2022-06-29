<%--
  Created by IntelliJ IDEA.
  User: CA2-PC-
  Date: 29/06/2022
  Time: 02:35 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="https://java.sun.com/jsp/jspl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pokemons</title>
</head>
<body>
<c:if test="${param['result']}">
    <p><c:out value="${param['message']}"></c:out> </p>

</c:if>

<table>
    <thead>
    <th>#</th>
    <th>Pokemon</th>
    </thead>
    <tbody>
    <c:forEach var="pokemon" items="${pokemons}" varStatus="status">
        <tr>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
