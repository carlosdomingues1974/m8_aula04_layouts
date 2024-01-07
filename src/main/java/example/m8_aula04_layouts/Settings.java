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
     *     // - Permitir manipular o tamanho da stage (caso da calculadora)
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

    //region AlertBox
    // Constantes para seleção do tipo de AlertBox
    /*public static int ALERTBOX_SHOW = 0;
    public static int ALERTBOX_DIALOG = 1;

    public static Optional<ButtonType> AlertBox(String title, String message, String header, Alert.AlertType icon, int alertType){
        Alert alert = new Alert(icon);   // Criação do objeto do tipo Alert
        alert.setTitle(title);          // Definição do texto da da barra de título (passado por parâmetro)
        alert.setContentText(message);       // Definição da mensagem (passado por parâmetro)
        alert.setHeaderText(header);         // Definição do texto para o cabeçalho (passado por parâmetro)

        // É possivel definir mais do que 2 botões e o texto deles.
        //ButtonType button = new ButtonType("Sim");
        //ButtonType ButtonType2 = new ButtonType("Não");
        // ButtonType ButtonType3 = new ButtonType("NãoSei");

        /** Modo de abertura da AlertBox. Se ALERTBOX_SHOW => é apenas Alert. Devolve o botão empty.
         * Isto permite não ter nenhuma variável a receber o return na chamada deste método.
         * caso contrário, é Dialog => devolve o botão pressionado: OK ou CANCEL. tem que ter tratamento
         * de retorno na chamada do método
         */
        /*if(alertType == ALERTBOX_SHOW){
            // Abrir em modo MODAL e devolve botão selecionado no estado EMPTY
            alert.showAndWait();
            return Optional.empty();
        }
        else{
            // Dialog: Abrir em modo MODAL e devolve botão selecionado para ser tratado na chamada.
            Optional<ButtonType> buttonPressed;
            buttonPressed = alert.showAndWait();
            return buttonPressed;
        }
    }*/
    //endregion
}

