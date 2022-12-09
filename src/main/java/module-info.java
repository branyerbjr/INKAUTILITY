module dev.inkautility {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens dev.inkautility to javafx.fxml;
    exports dev.inkautility;
}