/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.controller;

import ec.edu.espe.proyect.view.FrmLogIn;
import javax.swing.JFrame;

/**
 *
 * @author Jeimy
 */
public class FormsHandler1 {
   
     public static void goToMainScreen(JFrame jFrameToClose){
        FrmLogIn frmLogIn = new FrmLogIn();
        jFrameToClose.setVisible(false);
        frmLogIn.setVisible(true);
        
    } 
}