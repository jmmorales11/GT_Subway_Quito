/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.controller;

import ec.edu.espe.proyect.view.FrmSuccessful;
import javax.swing.JFrame;

/**
 *
 * @author Jeimy
 */
public class FormsSuccessfulRegistration {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmSuccessful  frmSuccessful  = new FrmSuccessful ();
        jFrameToClose.setVisible(false);
        frmSuccessful .setVisible(true);
    }
   
}
