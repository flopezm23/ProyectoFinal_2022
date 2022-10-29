package arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.sql.Statement;
import java.util.Scanner;


public class Armacenar {

    public static Connection conn;

    static {

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Jornal",
                    "postgres",
                    "progra123"
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }//fin del catch

    }//final del static

/*
    public void casi() throws IOException {
        Statement statement = null;
        try {
            statement = Armacenar.conn.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader("C:\\Users\\Elder\\IdeaProjects\\Hola Proyecto\\testedojson.json");
            Object object = parser.parse(reader);
            JSONObject tojson = (JSONObject) object;
            JSONArray array = (JSONArray) tojson.get("results");

            for (int i = 0; i < array.length(); i++) {

                JSONObject PlatoFuerte = (JSONObject) array.get(i);

                String titulo = (String) PlatoFuerte.get("title");
                String resumen = (String) PlatoFuerte.get("abstract");
                String firma = (String) PlatoFuerte.get("byline");
                String url = (String) PlatoFuerte.get("url");

                String titulo2=titulo;
                String resumen2 = resumen;
                String firma2= firma;
                String url2 = url;

                System.out.println("\n los Datos son");
                System.out.println("titulo= =" + titulo);
                System.out.println("resumen: = " + resumen);
                System.out.println("firma: =" + firma);
                System.out.println("url: =" + url);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }//final del catch


    }//final de mi public void
    */

    public Armacenar() throws IOException {
    }
}