<%--
  Created by IntelliJ IDEA.
  User: CA2-PC-
  Date: 05/07/2022
  Time: 10:13 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrar Pokemon</title>
    <jsp:include page="../../templates/head.jsp"/>
</head>
<body>
             <jsp:include page="../../templates/navbar.jsp"/>
             <div class="container">
                 <div class="row">
                     <div class="col-12">
                         <div class="card mt-5">
                             <div class="card-header">REGISTRO DE POKEMON</div>
                             <div class="card-body">
                                 <div class="row">
                                     <div class="col-12">
                                         <form class="needs-validation" action="add-pokemon" method="post">
                                             <div class="form-group mb-3">
                                                 <div class="row">
                                                     //Atributo 1
                                                     <div class="col">
                                                         <label class="fw-bold" for="pokemon">Nombre</label>
                                                         <input name="name" id="pokemon"
                                                         class="form-control"/>
                                                     </div>
                                                     //Atributo 2
                                                     <div class="col">
                                                         <label class="fw-bold" for="health">Puntos de salud</label>
                                                         <input name="health" id="health"
                                                                class="form-control"/>
                                                     </div>
                                                     //Atributo 3
                                                     <div class="col">
                                                         <label class="fw-bold" for="health">Puntos de salud</label>
                                                         <input name="health" id="health"
                                                                class="form-control"/>
                                                     </div>
                                                     //Atributo 4
                                                     <div class="col">
                                                         <label class="fw-bold" for="health">Puntos de salud</label>
                                                         <input name="health" id="health"
                                                                class="form-control"/>
                                                     </div>

                                                 </div>
                                             </div>
                                             <div class="form-group mb-3"></div>
                                             <div class="form-group mb-3"></div>
                                             <div class="form-group mb-3"></div>

                                         </form>
                                     </div>
                                 </div>
                             </div>
                         </div>
                     </div>
                 </div>
             </div>

</body>
</html>
