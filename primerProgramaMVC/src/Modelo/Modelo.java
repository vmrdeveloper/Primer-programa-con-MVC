/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vladi
 */
public class Modelo {
    private double celcius;
    private double farenheit;
    private double resultadoC;
    private double resultadoF;

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }

    public double getResultadoC() {
        return resultadoC;
    }

    public void setResultadoC(double resultadoC) {
        this.resultadoC = resultadoC;
    }

    public double getResultadoF() {
        return resultadoF;
    }

    public void setResultadoF(double resultadoF) {
        this.resultadoF = resultadoF;
    }

    
    
    public double convertirACelcius (){
    
    this.resultadoC = (this.farenheit - 32)* 0.55;
    return this.resultadoC;
    }
    
    public double convertirAFarenheit (){
    
    this.resultadoF = (this.celcius * 1.8)+ 32;
    return this.resultadoF;
    }
}
