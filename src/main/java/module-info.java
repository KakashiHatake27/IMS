module com.example.ims {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.ims to javafx.fxml;
    exports com.example.ims;
}