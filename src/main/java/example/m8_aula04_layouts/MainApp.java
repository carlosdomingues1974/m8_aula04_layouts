package example.m8_aula04_layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Método de startup da aplicação
 *  tem 2 métodos apenas: main e start.
 *  - main -> limita-se a lançar o array de argumentos para a super classe Application
 *  - start -> serve para definirmos o nosso código.
 */
public class MainApp extends Application {

    /**
     * Este método limita-se a lançar o array de argumentos para a super classe Application
     * No lançamento de qualquer aplicação podemos associar n Argumentos, que são
     * recebidos neste array e assim disponibilizados para a aplicação.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Este método carrega (load) a classe MainApp e serve para escrevermos o nosso código.
     * É o ponto de entrada principal de uma aplicação JavaFX.
     * Neste caso, executa a janela principal (primaryStage), associada à cena (scene) principal do ficheiro FXML
     * @param primaryStage é inicializado a janela (stage) da nossa aplicação.
     * @throws Exception serve para ignorar todos o warnings de exceções. Caso contrário temos qe usar o try...catch
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Aquisição do controlo de uma Scene baseada em XML (FXML) e associação à primaryStage
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        //Definições da Stage
        primaryStage.setTitle("Aula 4 - Layouts com menu - Troca de cenas");
        /** Passagem da referência da primaryStage para a classe static SETTINGS.
         *  Isto permite que, ao chamar as outras Stages a partir do menu, se possa completar
         *  a definição da modalariadade, caso contrário o sistema MODAL não irá funcionar.
         */
        //Settings.primaryStage = primaryStage;
        Settings.setPrimaryStage(primaryStage);
        //Abertura da stage
        primaryStage.show();
    }
}
