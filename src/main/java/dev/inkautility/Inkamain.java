package dev.inkautility;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Properties; // information OS
import java.io.IOException;

public class Inkamain extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Inicio Sesion");
        stage.setScene(scene);
        stage.show();
        //new Routes(stage);
    }
    public static void main(String[] args) {
        launch(args);
        /*Properties props = System.getProperties (); // Obtener el conjunto de propiedades del sistema
        String osName = props.getProperty ("os.name"); // Nombre del sistema operativo
        String osArch = props.getProperty ("os.arch"); // Arquitectura del sistema operativo
        String osVersion = props.getProperty ("os.version");
        String osUser=System.getProperty("user.name");
        String osUserDir =System.getProperty("user.dir");
        String osComputer = System.getenv("PROCESSOR_IDENTIFIER");
        System.out.println(osName);
        System.out.println(osArch);
        System.out.println(osVersion);
        System.out.println(osUser);
        //System.out.println(osUserDir);
        System.out.println(osComputer);*/

    }
}
