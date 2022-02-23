module com.hkl.englishapp.hkl {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hkl.englishapp.hkl to javafx.fxml;
    exports com.hkl.englishapp.hkl;
}
