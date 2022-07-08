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
                            <form class="needs-validation" novalidate action="add-pokemon" method="post">
                                <div class="form-group mb-3">
                                    <div class="row">

                                        <div class="col">
                                            <label class="fw-bold" for="pokemon">Nombre</label>
                                            <input name="name" id="pokemon" required
                                                   class="form-control" value="${pokemon.name}"/>
                                            <div class="invalid-feedback">
                                                Campo obligatorio
                                            </div>
                                            <input type="hidden" name="id" value="${pokemon.id}">
                                        </div>

                                        <div class="col">
                                            <label class="fw-bold" for="health">Puntos de salud</label>
                                            <input name="health" id="health" required
                                                   class="form-control" value="${pokemon.health}"/>
                                            <div class="invalid-feedback">
                                                Campo obligatorio
                                            </div>
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group mb-3">
                                    <div class="row">

                                        <div class="col">
                                            <label class="fw-bold" for="power">Poder</label>
                                            <input name="power" id="power" required
                                                   class="form-control" value="${pokemon.power}"/>
                                            <div class="invalid-feedback">
                                                Campo obligatorio
                                            </div>
                                        </div>

                                        <div class="col">
                                            <label class="fw-bold" for="weight">Peso</label>
                                            <input name="weight" id="weight" required
                                                   class="form-control" value="${pokemon.weight}"/>
                                            <div class="invalid-feedback">
                                                Campo obligatorio
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group mb-3">
                                    <div class="row">

                                        <div class="col">
                                            <label class="fw-bold" for="height">Altura</label>
                                            <input name="height" id="height" required
                                                   class="form-control" value="${pokemon.height}"/>
                                            <div class="invalid-feedback">
                                                Campo obligatorio
                                            </div>
                                        </div>

                                        <div class="col">
                                            <label class="fw-bold" for="pokemonType">Tipo de Pokemon</label>
                                            <input name="pokemonType" id="pokemonType" required
                                                   class="form-control" value="${pokemon.pokemonType}"/>
                                            <div class="invalid-feedback">
                                                Campo obligatorio
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group mb-3">
                                    <div class="row">
                                        <div class="col-12 text-end">
                                            <button type="button" class="btn btn-danger btn-sm">Cancelar</button>
                                            <button type="submit" class="btn btn-success btn-sm">Guardar</button>
                                        </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    (function() {
        'use strict';
        window.addEventListener('load', function() {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>

</body>
</html>
