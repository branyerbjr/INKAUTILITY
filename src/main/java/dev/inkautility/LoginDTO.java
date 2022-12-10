package dev.inkautility;

import DAO.UsuarioDAO;
import Models.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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
    protected void loginAction(ActionEvent event) throws Exception{
        String email = FEmail_L.getText();
        String pass = FPass_L.getText();
        if (!"".equals(email)|| !"".equals(pass)){
            metodos = new UsuarioDAO();
            user = metodos.login(email,pass);
            if (user.getEmail()!=null && user.getPass()!= null){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
                Parent root = loader.load();
                MenuDTO menuDTO = loader.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setResizable(false);
                stage.setTitle("Menu");
                stage.setScene(scene);
                menuDTO.datosLog();
                stage.show();
                stage.setOnCloseRequest(e -> menuDTO.closeWindows());
                Stage myStage = (Stage) this.LoginButton.getScene().getWindow();
                myStage.close();
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Inicio Sesion");
                alert.setContentText("Sus credenciales son incorrectas");
                alert.showAndWait();
                FEmail_L.setStyle("-fx-text-box-border: red;");
                FPass_L.setStyle("-fx-text-box-border: red;");
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Inicio Sesion");
            alert.setContentText("Ingrese sus credenciales en los campos");
            alert.showAndWait();
            FEmail_L.setStyle("-fx-text-box-border: red;");
            FPass_L.setStyle("-fx-text-box-border: red;");
        }
    }
    @FXML
    protected void registerAction(MouseEvent event) throws Exception{
        if (event.getButton() == MouseButton.PRIMARY){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Register.fxml"));
            Parent root = loader.load();
            RegisterDTO registerDTO  = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Registro");
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> registerDTO.closeWindows());
            Stage myStage = (Stage) this.Register_L.getScene().getWindow();
            myStage.close();
            //System.out.println("se hizo click");
        }
    }


    public void closeWindows() {
    }
}
