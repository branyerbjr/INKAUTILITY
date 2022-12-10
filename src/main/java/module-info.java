module dev.inkautility {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires com.google.gson;
    requires com.jfoenix;


    opens dev.inkautility to javafx.fxml;
    exports dev.inkautility;

}