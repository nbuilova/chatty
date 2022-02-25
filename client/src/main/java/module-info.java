module ru.gb.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.client to javafx.fxml;
    exports ru.gb.client;
}