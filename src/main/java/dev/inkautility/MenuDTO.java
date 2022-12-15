package dev.inkautility;
import DAO.UsuarioDAO;
import Models.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuDTO{

    @FXML
    Label nameText_M,BtnBack_M;

    public MenuDTO() {
    }

    public void datosLog(Usuario user){
        nameText_M.setText(user.getNombres());
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
            Stage myStage = (Stage) this.BtnBack_M.getScene().getWindow();
            myStage.close();
        }
    }
    public void closeWindows(){}
}
