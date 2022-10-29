<%@ page import="java.util.List" %>
<%@ page import="arquivos.*" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Fer
  Date: 25/10/2022
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Comentarios</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>
<body>


<div class="row">
    <form class="col s12" method="post" action="AdicionandoC.jsp">
        <div class="row">
            <div class="input-field col s6">
                <input id="user_name" name="nombres" type="text" class="validate">
                <label for="user_name">Nombre</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s6">
                <input id="come" name="comentarios" type="text" class="validate">
                <label for="come">comentario</label>
            </div>
        </div>
        <button class="btn waves-effect waves-light" type="submit" name="action" style="background-color: darkblue">
            <i class="material-icons right">Mandar comentario</i>
        </button>
    </form>
</div>





<table class="striped">
    <thead>
    <tr>
        <th>Nombre</th>
        <th>Comentario</th>
    </tr>
    </thead>

    <tbody>


    <%
        ComentariosDoing artte = new ComentariosDoing();
        List<Comments> comentario = artte.getAllDB();
        for( Comments articlesss : comentario ){
    %>

    <tr>
        <td><%= articlesss.getComentario() %></td>
        <td><%= articlesss.getNome() %></td>
    </tr>
    <%
        }
    %>



    </tbody>
</table>




<a class="waves-effect waves-light btn" href="Home.jsp" class="material-icons left" style="background-color: darkblue">Home</a>
<footer class="page-footer" style="background-color: lightslategray">
    <div class="container">
        <div class="row">
            <div class="col l6 s12">
                <h5 class="white-text">PROGRAMACION II</h5>
                <p class="grey-text text-lighten-4">Fernando Omar López Morales, 7690-21-20755</p>
            </div>

        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">
            © Universidad Mariano Gálvez de Guatemala

        </div>
    </div>
</footer>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
