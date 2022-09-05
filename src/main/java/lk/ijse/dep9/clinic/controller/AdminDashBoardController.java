package lk.ijse.dep9.clinic.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import lk.ijse.dep9.clinic.security.SecurityContextHolder;

public class AdminDashBoardController {
    public JFXButton btnProfileM;
    public JFXButton btnViewRecords;
    public JFXButton btnSettings;

    public void initialize(){
        System.out.println(SecurityContextHolder.getPrinciple());
    }

    public void btnProfileM_OnAction(ActionEvent actionEvent) {
    }

    public void btnViewRecords_OnAction(ActionEvent actionEvent) {
    }

    public void btnSettings_OnAction(ActionEvent actionEvent) {
    }
}
