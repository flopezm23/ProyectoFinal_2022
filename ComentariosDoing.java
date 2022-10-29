package arquivos;

import arquivos.Armacenar;
import arquivos.Artigos;
import arquivos.Carmacenar;
import arquivos.Comments;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ComentariosDoing {



    public List<Comments> getAllDB() {
        List<Comments> texto = new ArrayList<>();
        try {
            Statement siuu = Armacenar.conn.createStatement();
            String sqll = "select * from comentarios";
            ResultSet rs = siuu.executeQuery(sqll);

            while (rs.next()) {
                Comments articlesss = new Comments("as",
                        rs.getString("nombre"),
                        rs.getString("comentarios")

                );//final de articless
                texto.add(articlesss);
            }//final del while
        } catch (SQLException throwables) {
            System.out.println("getAllDB: " + throwables.getMessage());
            throwables.printStackTrace();
        }//final de catch
        return texto;
    }//final de List

    public void saveOne(Artigos articulo) {
        //....
    }

    public void almost(String nombrado, String comentado) throws IOException, SQLException {

        //segundo prueba para leer el json

                Statement statement = Carmacenar.conn.createStatement();
                String sqll = "INSERT INTO comentarios(nombre,comentarios)VALUES('" + nombrado + "','" + comentado   + "' )";
                statement.executeUpdate(sqll);

//fin de la segunda prueba json


    }//final de mi public void casi



}
