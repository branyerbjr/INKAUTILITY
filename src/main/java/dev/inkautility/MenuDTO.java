package dev.inkautility;
import DAO.UsuarioDAO;
import Models.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuDTO{
    String nom, ape;
    Usuario user = new Usuario();

    @FXML
    Label nameText_M;

    public MenuDTO() {
    }

    /*public MenuDTO(Usuario u) {

    }*/

    public MenuDTO(Usuario user) {
        this.user = user;
    }

    public void datosLog(){
        nameText_M.setText("administrador");
    }



    public void closeWindows(){

    }
}
