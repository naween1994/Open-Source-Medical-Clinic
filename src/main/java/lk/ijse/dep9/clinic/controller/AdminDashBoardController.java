package lk.ijse.dep9.clinic.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.dep9.clinic.security.SecurityContextHolder;

import java.io.IOException;

public class AdminDashBoardController {
    public JFXButton btnProfileM;
    public JFXButton btnViewRecords;
    public JFXButton btnSettings;
    public JFXButton btnLogOut;

    public void initialize(){
        System.out.println(SecurityContextHolder.getPrinciple());
    }

    public void btnProfileM_OnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent container = FXMLLoader.load(this.getClass().getResource("/view/AdminProfileManagementForm.fxml"));
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void btnViewRecords_OnAction(ActionEvent actionEvent) {
    }

    public void btnSettings_OnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent container = FXMLLoader.load(this.getClass().getResource("/view/AdminSettingsForm.fxml"));
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void btnLogOut_OnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent container = FXMLLoader.load(this.getClass().getResource("/view/LoginForm.fxml"));
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
        btnLogOut.getScene().getWindow().hide();

    }
}
