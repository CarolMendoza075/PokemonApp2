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
                    <div class="row">
                        <div class="col-6"></div>
                        <div class="col-6 text-end">
                            <a href="create-pokemon" class="btn btn-outline-sucess btn-sm">
                                Registrar pokemon
                            </a>
                        </div>


                    </div>
                </div>
                <div class="card-body">
                    <table class="table table-sm table-hover">
                        <thead>
                        <th>#</th>
                        <th>Pokemon</th>
                        <th>Acciones</th>
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
                                <td>
                                    <a href="get-pokemon?id=${pokemon.id}$" class="btn btn-warning btn-sm">EDITAR</a>
                                    <a href="delete-pokemon?id=${pokemon.id}$" class="btn btn-danger btn-sm">ELIMINAR</a>
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