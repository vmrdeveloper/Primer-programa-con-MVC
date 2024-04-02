/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerprogramamvc;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author vladi
 */
public class PrimerProgramaMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vista vw = new Vista();
        Modelo md = new Modelo();
        Controlador ctr = new Controlador(vw, md);
        
        ctr.iniciar();
        vw.setVisible(true);
        
    }
    
}
