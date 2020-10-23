/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author odraude
 */
public class Cuadrado extends PadreFiguras {
    public Cuadrado(float Base, float Altura){
        super(Base,Altura);
    }

    @Override
    public void getPerimetro() {
        pPerimetro=(pBase*2)+(pAltura*2);
    }

    @Override
    public void getArea() {
        pArea=pBase*pAltura;  
    }
    
}
