<%--
  Created by IntelliJ IDEA.
  User: CA2-PC-
  Date: 29/06/2022
  Time: 02:35 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pokémons</title>
    <jsp:include page="../../templates/head.jsp"/>


</head>
<jsp:include page="../../templates/navbar.jsp"/>
<div class="container mt-5">
    <div class="row">
        <div class="col-12">
            <body>
            <c:if test="${param['result']}">
            <p><c:out value="${param['message']}"></c:out></p>
            </c:if>
            <div class="card">
                <div class="card-header">
                    POKEMONS
                </div>
                <div class="card-body">
                    <table class="table table-sm table-hover">
                        <thead>
                        <th>#</th>
                        <th>Pokemon</th>
                        </thead>
                        <tbody>
                        <c:forEach var="pokemon" items="${pokemons}" varStatus="status">
                            <tr>
                                <td>
                                    <c:out value="${status.count}"></c:out>
                                </td>
                                <td>
                                    <c:out value="${pokemon.name}"></c:out>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../../templates/footer.jsp"/>
</body>
</html>