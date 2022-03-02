module com.hkl.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hkl.bmiapp to javafx.fxml;
    exports com.hkl.bmiapp;
}
