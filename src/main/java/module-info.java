module dev.inkautility {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires com.google.gson;


    opens dev.inkautility to javafx.fxml;
    exports dev.inkautility;
    opens DTO to javafx.fxml;
    exports DTO;


}