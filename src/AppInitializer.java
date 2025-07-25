import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("view/LoginForm.fxml"))
                )
        );
        primaryStage.show();

    }
}
