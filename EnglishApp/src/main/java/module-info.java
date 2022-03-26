module com.hkl.englishapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.hkl.englishapp to javafx.fxml;
    exports com.hkl.englishapp;
    exports com.hkl.pojo;
}
