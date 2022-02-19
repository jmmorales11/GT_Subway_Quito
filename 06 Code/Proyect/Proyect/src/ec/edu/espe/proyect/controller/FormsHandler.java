/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.controller;

import ec.edu.espe.proyect.view.FrmLogIn;
import ec.edu.espe.proyect.view.FrmQuitoSubwayPlanner;
import javax.swing.JFrame;

/**
 *
 * @author Jeimy
 */
public class FormsHandler {
   
     public static void goToMainScreen(JFrame jFrameToClose){
        FrmQuitoSubwayPlanner frmQuitoSubwayPlanner = new FrmQuitoSubwayPlanner();
        jFrameToClose.setVisible(false);
        frmQuitoSubwayPlanner.setVisible(true);
        
    }    
    
}
