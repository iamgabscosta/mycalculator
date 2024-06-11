import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class calculator_screen extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader carregarTela = new FXMLLoader(getClass().getResource("/fxml/controller.fxml"));
        Parent calculadora = carregarTela.load();
        Scene carregarCalculadora = new Scene(calculadora);
        carregarCalculadora.getStylesheets().add("/css/style.css");
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(carregarCalculadora);
        primaryStage.show();

    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
