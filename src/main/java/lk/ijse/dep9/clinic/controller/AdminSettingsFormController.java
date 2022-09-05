package lk.ijse.dep9.clinic.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminSettingsFormController {
    public JFXButton btnHospitalFee;
    public JFXButton btnDiscount;
    public JFXButton btnFields;
    public JFXButton btnPassword;
    public JFXButton btnAbout;
    public AnchorPane pneContainer;

    public void btnHospitalFee_OnAction(ActionEvent actionEvent) {
        pneContainer.getChildren().clear();
    }

    public void btnDiscount_OnAction(ActionEvent actionEvent) {
        pneContainer.getChildren().clear();
    }

    public void btnFields_OnAction(ActionEvent actionEvent) throws IOException {
        pneContainer.getChildren().clear();
        AnchorPane manageFields = FXMLLoader.load(this.getClass().getResource("/view/AdminSettingsManageFieldsForm.fxml"));
        pneContainer.getChildren().add(manageFields);
    }

    public void btnPassword_OnAction(ActionEvent actionEvent) {
        pneContainer.getChildren().clear();
    }

    public void btnAbout_OnAction(ActionEvent actionEvent) {
        pneContainer.getChildren().clear();
    }
}
