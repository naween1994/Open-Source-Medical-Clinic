package lk.ijse.dep9.clinic.controller;

import lk.ijse.dep9.clinic.security.SecurityContextHolder;

public class AdminDashBoardController {
    public void initialize(){
        System.out.println(SecurityContextHolder.getPrinciple());
    }
}
