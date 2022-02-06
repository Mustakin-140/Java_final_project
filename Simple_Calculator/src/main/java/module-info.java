module com.mycompany.simpcalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.simpcalc to javafx.fxml;
    exports com.mycompany.simpcalc;
}
