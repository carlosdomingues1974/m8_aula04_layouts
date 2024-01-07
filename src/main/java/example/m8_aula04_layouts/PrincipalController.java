package example.m8_aula04_layouts;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Optional;

import static example.m8_aula04_layouts.Settings.ALERTBOX_DIALOG;
import static example.m8_aula04_layouts.Settings.AlertBox;

public class PrincipalController {

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
}
