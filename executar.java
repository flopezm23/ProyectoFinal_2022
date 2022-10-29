package arquivos;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.stream.events.Comment;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class executar {
    int repete=0;
    Artigos[] steps = new Artigos[100]; //variable local para almacenar los datos del objeto anterior
    Comments[] lift = new Comments[100]; //variable local para almacenar los datos del objeto anterior
    int cuenta = 0;

    public List<Artigos> getAllDB() {
        List<Artigos> article = new ArrayList<>();
        try {
            Statement statement = Armacenar.conn.createStatement();
            String sql = "select * from artigos";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Artigos articless = new Artigos("1",
                        rs.getString("titulo"),
                        rs.getString("resumo"),
                        rs.getString("firma"),
                        rs.getString("url")
                );//final de articless
                article.add(articless);
            }//final del while
        } catch (SQLException throwables) {
            System.out.println("getAllDB: " + throwables.getMessage());
            throwables.printStackTrace();
        }//final de catch
        return article;
    }//final de List

    public void saveOne(Artigos articulo) {
        //....
    }

    //funcion para capturar los comentarios
    public void comentando(Artigos siuu) {
        steps[cuenta] = siuu;

        cuenta++;
    }//final de comentando


    public void casi() throws IOException, SQLException {

        //segundo prueba para leer el json


        String dados = new String(Files.readAllBytes(Paths.get("C:\\Users\\Elder\\IdeaProjects\\Projeto_Final\\testedojson.json")));
        System.out.println("avanzando 1");
        JSONArray arreglototales = new JSONArray(dados);
        System.out.println("avanzando 2");

        if(repete==0) {
            for (int i = 0; i < arreglototales.length(); i++) {//for para repetir por el numerod de arreglos en el JSON
                JSONObject elementos = arreglototales.getJSONObject(i);
                //Object encabezado = elementos.get("results");
                Object titulando = elementos.get("title");
                //String titulo = elementos.getString("title");
                String abstractos = elementos.getString("abstract");
                String bylines = elementos.getString("byline");
                String miurl = elementos.getString("url");

                System.out.println(titulando);
                //System.out.println(titulo);
                System.out.println(abstractos);
                System.out.println(bylines);
                System.out.println(miurl);

                Statement statement = Armacenar.conn.createStatement();
                String sql = "INSERT INTO artigos(titulo,resumo,firma,url)VALUES('" + titulando + "','" + abstractos + "', '" + bylines + "','" + miurl + "' )";
                statement.executeUpdate(sql);

            }//fin del for
        }//final del if
            repete++;
//fin de la segunda prueba json


    }//final de mi public void casi

}//final de executar
