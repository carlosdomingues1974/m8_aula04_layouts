package example.m8_aula04_layouts;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class PrincipalController {
    @FXML
    private BorderPane borderPane;

    public void menuExitApplication(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Sair da aplicação");
        alert.setHeaderText("Deseja mesmo sair da apliação?");
        // Adiciona botões personalizados em português
        ButtonType botaoSim = new ButtonType("Sim");
        ButtonType botaoNao = new ButtonType("Não");
        alert.getButtonTypes().setAll(botaoSim, botaoNao);

        Optional<ButtonType> choose = alert.showAndWait();
        if(choose.get() == botaoSim) {
            Platform.exit();
        }
    }

    public void menuAbout(ActionEvent actionEvent) throws Exception {
        // Aquisição do controlo da cena (Scene) about FXML
        Parent scene = FXMLLoader.load(getClass().getResource("about.fxml"));

        //Nova janela (Stage)
        Stage about = new Stage();
        //Definições da Stage
        about.setTitle("Acerca de");

        // Associação da Scene à Stage
        about.setScene(new Scene(scene));

        // Abertura da janela About em modo MODAL, em relação à primaryStage
        //about.initOwner(Settings.primaryStage);
        about.initOwner(Settings.getPrimaryStage());
        about.initModality(Modality.WINDOW_MODAL);

        //Abertura da janela About
        about.show();
    }

    /**
     * Switch Scene é a técnica de substituir a Scene na Stage,
     * É uma vantagem do JavaFX faça a outros concorrentes, pois dispensa o peso
     * de ter várias Interfaces (Stage + Scene). Permite usar 1 Stage com várias Scenes.
     * O problema surge quando há um navegador como o menu, pois ao substituir a Scene
     * que tem o menu, perdemos o acesso ao menu.
     * @param actionEvent evento disparado
     * @throws Exception serve para ignorar todos o warnings de exceções. Caso contrário temos qe usar o try...catch
     */
    public void buttonSwitchScene(ActionEvent actionEvent) throws Exception {
        // Aquisição do controlo da cena do Layout AnchorPane FXML (anchorpane.fxml) e
        // associar à zona central da BorderPane.
        // Aquisição do controlo do Scene pretendida
        Parent scene = FXMLLoader.load(getClass().getResource("anchorpane.fxml"));

        // Atribuição da Scene à zona central da cena Principal, que é um BorderPane
        Settings.getPrimaryStage().setScene(new Scene(scene));
        //primaryStage.setScene(new Scene(scene));
    }

    /**
     * Carrega a cena anchorPane para a zona central do borderPane
     * @param actionEvent evento disparado
     * @throws Exception serve para ignorar todos o warnings de exceções. Caso contrário temos qe usar o try...catch
     */
    public void menuAnchorPane(ActionEvent actionEvent) throws Exception{
        // Aquisição do controlo da cena do Layout AnchorPane FXML (anchorpane.fxml) e
        // associar à zona central da BorderPane.
        // Aquisição do controlo do Scene pretendida
        Parent scene = FXMLLoader.load(getClass().getResource("anchorpane.fxml"));

        // Atribuição da Scene à zona central da cena Principal, que é um BorderPane
        borderPane.setCenter(scene);
    }

    /**
     * Carrega a cena borderPane para a zona central do borderPane
     * @param actionEvent evento disparado
     * @throws Exception serve para ignorar todos o warnings de exceções. Caso contrário temos qe usar o try...catch
     */
    public void menuBorderPane(ActionEvent actionEvent) throws Exception {
        // Aquisição do controlo da cena do Layout AnchorPane FXML (anchorpane.fxml) e
        // associar à zona central da BorderPane.
        // Aquisição do controlo do Scene pretendida
        Parent scene = FXMLLoader.load(getClass().getResource("borderpane.fxml"));

        // Atribuição da Scene à zona central da cena Principal, que é um BorderPane
        borderPane.setCenter(scene);
    }
}
