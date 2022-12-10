package dev.inkautility;

import DAO.UsuarioDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterDTO {
    UsuarioDAO metodos;
    @FXML
    TextField EmailF_R,PassF1_R,PassF2_R,DNIF_R,CellularF_R;
    @FXML
    ComboBox GeneroCB_R;
    @FXML
    Button BtnRegistrar_R;



    public void ValidationAction(ActionEvent event)throws Exception{
        String email = EmailF_R.getText();
        String pass1 = PassF1_R.getText();
        String pass2 = PassF2_R.getText();
        String dni = DNIF_R.getText();
        String tel = CellularF_R.getText();
        Byte genero = 1;
        if (!"".equals(email)|| !"".equals(pass1)||!"".equals(pass2)||!"".equals(dni)||!"".equals(tel)){
            if (pass1.equals(pass2)){
                metodos =new UsuarioDAO();
                metodos.RegiUser(dni,email,pass1,tel,genero);
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
                Stage myStage = (Stage) this.BtnRegistrar_R.getScene().getWindow();
                myStage.close();
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Registro");
                alert.setContentText("No coinciden");
                alert.showAndWait();}
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Registro");
            alert.setContentText("Datos Incompletos");
            alert.showAndWait();
        }

    }



    public void closeWindows(){


    }
}
