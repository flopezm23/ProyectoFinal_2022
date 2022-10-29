<%@ page import="arquivos.ComentariosDoing" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="arquivos.Carmacenar" %><%--
  Created by IntelliJ IDEA.
  User: Fer
  Date: 28/10/2022
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>
<body>

<%
    //pruebas
    String names =request.getParameter("nombres");
    String comments =request.getParameter("comentarios");


    ComentariosDoing haciendo = new ComentariosDoing();
    //System.out.println(names+" "+comments+" ");
    if(names!=null) {
        //haciendo.almost(nombre, comentar);
        Statement statement = Carmacenar.conn.createStatement();
        //String sqll = "INSERT INTO comentarios(nombre,comentarios)VALUES('" + nombre + "','" + comentar   + "' )";

        //teste 2.0
        String sqll = "INSERT INTO comentarios(nombre,comentarios)VALUES('" + names + "','" + comments   + "' )";

        statement.executeUpdate(sqll);
    }//final if

    response.sendRedirect("Paartigo.jsp");//para recargar la página de paartigo

%>

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
