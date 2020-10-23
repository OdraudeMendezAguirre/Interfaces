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
public class Circulo extends PadreFiguras{
    public Circulo(final float PI,float radio){
        super(PI,radio);
    }

    @Override
    public void getPerimetro() {
        pPerimetro=pBase*(pAltura*2);
    }

    @Override
    public void getArea() {
        pAltura=pBase*(pAltura*pAltura);
    }
    
}
