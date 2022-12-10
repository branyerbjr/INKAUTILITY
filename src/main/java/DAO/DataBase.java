package DAO;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    Connection con;
    URLConnection api;
    URL ruta;
    String url = "jdbc:mysql://localhost:3306/inkautility";
    String user = "root";
    String pass = "";

    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user,pass);
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR DE CONEXION "+e);
        }
        return con;
    }

    public URLConnection APIREST(String dni){
        String enlace = "https://api.apis.net.pe/v1/dni?numero="+dni;
        try {
            ruta = new URL(enlace);
            api = ruta.openConnection();
        } catch (IOException e) {
            System.out.println("ERROR DE CONEXION APIREST "+e);
        }
        return api;
    }
}
