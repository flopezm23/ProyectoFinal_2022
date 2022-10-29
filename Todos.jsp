<%@ page import="arquivos.Armacenar" %>
<%@ page import="arquivos.Artigos" %>
<%@ page import="java.awt.*" %>
<%@ page import="arquivos.executar" %>
<%@ page import="java.util.List" %>
<%@ page import="arquivos.ComentariosDoing" %><%--
  Created by IntelliJ IDEA.
  User: Fer
  Date: 25/10/2022
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Articulos</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>
<body>



<table class="striped">
    <thead>
    <tr href="Home.jsp">
        <th>Identificador</th>
        <th>Titulo</th>
        <th>Contenido</th>
        <th>Foto</th>
    </tr>
    </thead>

    <tbody>

    <%
        executar artt = new executar();
        List<Artigos> article = artt.getAllDB();
        for( Artigos articless : article ){
    %>
    <tr>
        <td><%= articless.getTitulo() %></td>
        <td><%= articless.getResumo() %></td>
        <td><%= articless.getFirma() %></td>
        <td><%= articless.getUrl()%>%</td>
        <td> <a href="https://<%=articless.getUrl()%>">  </a> </td>
    </tr>
    <%
        }
    %>

    </tbody>
</table>

<a class="waves-effect waves-light btn" href="Home.jsp" class="material-icons left" style="background-color: darkblue" >Home</a>

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
