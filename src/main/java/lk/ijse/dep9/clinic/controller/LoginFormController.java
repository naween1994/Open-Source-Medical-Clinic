package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.AbstractList;

public class LoginFormController {
    public TextField txtUsername;
    public TextField txtPassword;
    public Button btnLogin;

    public void initialize(){
        btnLogin.setDefaultButton(true);
    }

    public void btnLogin_OnAction(ActionEvent actionEvent) {
        String userName = txtUsername.getText();
        String passwordText = txtPassword.getText();

        if(userName.isBlank()){
            new Alert(Alert.AlertType.ERROR,"Username cannot be empty").showAndWait();
            txtUsername.requestFocus();
            txtUsername.selectAll();
            return;
        }else if(passwordText.isBlank()){
            new Alert(Alert.AlertType.ERROR,"Password cannot be empty").showAndWait();
            txtPassword.requestFocus();
            txtPassword.selectAll();
            return;
        }else if(!txtUsername.getText().matches("^[a-zA-Z0-9]+$")){
            new Alert(Alert.AlertType.ERROR,"invalid credentials").showAndWait();
            txtPassword.requestFocus();
            txtPassword.selectAll();
            return;
        }
    }
}
