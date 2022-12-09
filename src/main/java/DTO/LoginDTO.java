package DTO;

import DAO.UsuarioDAO;
import Models.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginDTO {
    UsuarioDAO metodos;
    Usuario user;
    @FXML
    TextField FEmail_L, FPass_L;
    @FXML
    Button LoginButton;
    @FXML
    Label Recovery_L, Register_L;

    @FXML
    protected void loginAction(ActionEvent event){
        String email = FEmail_L.getText();
        String pass = FPass_L.getText();
        if (!"".equals(email)|| !"".equals(pass)){
            metodos = new UsuarioDAO();
            user = metodos.login(email,pass);
            if (user.getEmail()!=null && user.getPass()!= null){


            }else {}
        }else {}


    }
}
