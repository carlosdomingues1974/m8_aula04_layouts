module example.m8_aula04_layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens example.m8_aula04_layouts to javafx.fxml;
    exports example.m8_aula04_layouts;
}