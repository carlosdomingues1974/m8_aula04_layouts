package example.m8_aula04_layouts;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AnchorPaneController {

    /**
     * Switch Scene é a técnica de substituir a Scene na Stage,
     * É uma vantagem do JavaFX faça a outros concorrentes, pois dispensa o peso
     * de ter várias Interfaces (Stage + Scene). Permite usar 1 Stage com várias Scenes.
     * @param actionEvent
     * @throws Exception
     */
    public void buttonBackToPrincipalScene(ActionEvent actionEvent) throws Exception {
        // Aquisição do controlo da cena do Layout AnchorPane FXML (anchorpane.fxml) e
        // associar à zona central da BorderPane.
        // Aquisição do controlo do Scene pretendida
        Parent scene = FXMLLoader.load(getClass().getResource("principal.fxml"));

        // Atribuição da Scene à zona central da cena Principal, que é um BorderPane
        Settings.getPrimaryStage().setScene(new Scene(scene));
    }
}
