package arquivos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Carmacenar {

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

    public Carmacenar() throws IOException {
    }//final del public

}
