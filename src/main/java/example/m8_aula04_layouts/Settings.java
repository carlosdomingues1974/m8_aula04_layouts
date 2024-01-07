package example.m8_aula04_layouts;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Settings {

    //region Stage
    /**
     * Stage da aplicação, guardada nesta classe de controlo, permite que
     *     // seja acedida por qualquer outra classe de trabalho, e com isso
     *     // Tem várias vantagens.
     *     // - Permitir manipular o tamanho da stage
     *     // - Permitir defini-la Parent de outras stages Modais, etc.
     */
    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        Settings.primaryStage = primaryStage;
    }
    //endregion


}

