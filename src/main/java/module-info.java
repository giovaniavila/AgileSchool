module com.example.agileschool {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.agileschool to javafx.fxml;
    exports com.example.agileschool;
}