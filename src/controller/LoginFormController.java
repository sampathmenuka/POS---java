package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane container;
    public TextField txtEmail;
    public TextField txtPassword;

    public void AccessDashboardOnAction(ActionEvent actionEvent) {
    }

    public void CreateAccountOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SignUpForm");
    }

    private void setUi(String path) throws IOException {
        Stage stage = (Stage) container.getScene().getWindow();
        stage.setScene(
                new Scene(FXMLLoader.load(getClass().getResource("../view/"+path+".fxml")))
        );
    }
}
