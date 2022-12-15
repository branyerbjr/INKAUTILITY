package DAO;

import Models.Usuario;
import com.google.gson.*;
import javafx.scene.control.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    DataBase db = new DataBase();
    Connection conMysql = db.conectar();


    public Usuario login(String email, String pass){
        Usuario l = new Usuario();
        CallableStatement cs;
        try {
            cs = conMysql.prepareCall("{call INICIO_SESION(?,?)}");
            cs.setString(1, email);
            cs.setString(2, pass);
            ResultSet rs= cs.executeQuery();
            if(rs.next()) {
                l.setIdUsuario(rs.getInt("idUSUARIO"));
                l.setNombres(rs.getString("NOMBRES"));
                l.setApellidos(rs.getString("APELLIDOS"));
                l.setDni(rs.getString("DNI"));
                l.setEmail(rs.getString("EMAIL"));
                l.setPass(rs.getString("CONTRASEÑA"));
                l.setGenero(rs.getByte("GENERO"));
                l.setMovil(rs.getString("MOVIL"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }

    public void RegiUser(String dni,String email,String pass,String cell,Byte genero){
        URLConnection request = db.APIREST(dni);
        CallableStatement cs;
        try {
            request.connect();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            if (root.isJsonObject()) {
                JsonObject rootobj = root.getAsJsonObject();
                String apell_Paterno = rootobj.get("apellidoPaterno").getAsString();
                String apell_Materno = rootobj.get("apellidoMaterno").getAsString();
                String nombres = rootobj.get("nombres").getAsString();
                cs = conMysql.prepareCall("{call REGISTRAR_USUARIO(?,?,?,?,?,?,?)}");
                cs.setString(1, nombres);
                cs.setString(2, apell_Paterno+" "+apell_Materno);
                cs.setString(3, dni);
                cs.setString(4, email);
                cs.setString(5, pass);
                cs.setByte(6, genero);
                cs.setString(7, cell);
                cs.execute();
            }else{System.out.println("Error de json ");}
        } catch (JsonIOException | JsonSyntaxException | IOException | SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Registro");
            alert.setContentText("Error de registro");
            alert.showAndWait();
            System.out.println("Error de registro "+e);
        }
    }

    public Usuario Recovery(String email, String dni){
        Usuario l = new Usuario();
        CallableStatement cs;
        try {
            cs = conMysql.prepareCall("{call RECOVERY_SESION(?,?)}");
            cs.setString(1, email);
            cs.setString(2, dni);
            ResultSet rs= cs.executeQuery();
            if (rs.next()) {
                l.setIdUsuario(rs.getInt("idUSUARIO"));
                l.setDni(rs.getString("DNI"));
                l.setEmail(rs.getString("EMAIL"));
            }
        } catch (SQLException e) {e.printStackTrace();}
        return l;
    }

    public void Password(int id, String pass){
        CallableStatement cs;
        try {
            cs = conMysql.prepareCall("{call UPDATE_PASSWORD(?,?)}");
            cs.setInt(1, id);
            cs.setString(2, pass);
            ResultSet rs= cs.executeQuery();
            Alert alert;
            if (rs != null) {
                alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Password");
                alert.setContentText("Contraseña actualizada Correctamente");
                alert.showAndWait();
            }else {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Password");
                alert.setContentText("NO! Se pudo Actualizar la contraseña");
                alert.showAndWait();
            }
        }catch (SQLException e){
            System.out.println("Error UpdatePass: "+e);
        }
    }
}
