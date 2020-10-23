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
public class Triangulo extends PadreFiguras{
    protected float lado2,lado3;
    public Triangulo(float Base, float Altura,float lado2,float lado3){
        super(Base,Altura);
        this.lado2=lado2;
        this.lado3=lado3;
    }

    @Override
    public void getPerimetro() {
        pPerimetro=pBase+lado2+lado3;
    }

    @Override
    public void getArea() {
        pArea=(pBase*pAltura)/2;
    }
}
