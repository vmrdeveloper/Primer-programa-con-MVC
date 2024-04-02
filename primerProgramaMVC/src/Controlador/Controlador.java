/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author vladi
 */
public class Controlador implements  ActionListener{
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
    
        this.view = view;
        this.model = model;
        this.view.btncelcius.addActionListener(this);
        this.view.btnfarenheit.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Convertidor de temperaturas");
        view.setLocationRelativeTo(null);
    }
    
     
    /*public void actionPerfomed(ActionEvent e){
        model.setCelcius (Double.parseDouble((view.txttemp.getText())));
        model.convertirAFarenheit();
        view.txtresultado.setText(String.valueOf(model.getResultadoF()));
    }*/
    
    /*public void accionConvertirACelcius (ActionEvent e){
    model.setFarenheit(Double.parseDouble(view.txttemp.getText()));
    model.convertirACelcius();
    view.txtresultado.setText(String.valueOf(model.getResultadoC()));
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == view.btncelcius){
        
            model.setFarenheit(Double.parseDouble(view.txttemp.getText()));
            model.convertirACelcius();
            view.txtresultado.setText(String.valueOf(model.getResultadoC()));
        } else if (e.getSource() == view.btnfarenheit)
        {
            model.setCelcius(Double.parseDouble(view.txttemp.getText()));
            model.convertirAFarenheit();
            view.txtresultado.setText(String.valueOf(model.getResultadoF()));
        
        }
    }

    

    
    
    
}
