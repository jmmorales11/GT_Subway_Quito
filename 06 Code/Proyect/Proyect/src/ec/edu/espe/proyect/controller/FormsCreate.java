/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.controller;

import ec.edu.espe.proyect.view.FrmCreateAccount;
import javax.swing.JFrame;

/**
 *
 * @author Jeimy
 */
public class FormsCreate {
    public static void goToMainScreen(JFrame jFrameToClose){
    FrmCreateAccount frmCreateAccount = new FrmCreateAccount();
    jFrameToClose.setVisible(false);
    frmCreateAccount.setVisible(true);
}
}
