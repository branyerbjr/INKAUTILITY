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
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class RecoveyDTO {
    UsuarioDAO metodos;
    Usuario user;

    @FXML
    TextField EmailF_RP,DNIF_RP;
    @FXML
    Button BtnRecovery_RP;
    @FXML
    ImageView BtnBack_RP;

    public void ValidationPass(ActionEvent event)throws Exception{
        String email = EmailF_RP.getText();
        String dni = DNIF_RP.getText();
        if (!"".equals(email)|| !"".equals(dni)){
            metodos = new UsuarioDAO();
            user = metodos.Recovery(email,dni);
            if (user.getEmail()!=null && user.getDni()!= null){
                TextInputDialog Dpass = new TextInputDialog();
                Dpass.setTitle("Recovery Password");
                Dpass.setHeaderText("Ingrese la nueva contraseña");
                Dpass.showAndWait();
                String pass = Dpass.getResult();
                metodos.Password(user.getIdUsuario(),pass);
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
                Parent root = loader.load();
                LoginDTO loginDTO = loader.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setResizable(false);
                stage.setTitle("Menu");
                stage.setScene(scene);
                stage.show();
                stage.setOnCloseRequest(e -> loginDTO.closeWindows());
                Stage myStage = (Stage) this.BtnRecovery_RP.getScene().getWindow();
                myStage.close();
            }else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Recovery");
                alert.setContentText("No coinciden con ni una cuenta");
                alert.showAndWait();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Recovery");
            alert.setContentText("Datos Incompletos");
            alert.showAndWait();
        }

    }
    @FXML
    protected void Back(MouseEvent event)throws Exception{
        if (event.getButton() == MouseButton.PRIMARY){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            LoginDTO loginDTO = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> loginDTO.closeWindows());
            Stage myStage = (Stage) this.BtnBack_RP.getScene().getWindow();
            myStage.close();
        }
    }

    public void closeWindows(){}
}
