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
public abstract class PadreFiguras implements InterfazFiguras {
    protected float pBase, pAltura,pPerimetro,pArea;
    
    PadreFiguras(float base, float altura){
        this.pBase=base;
        this.pAltura=altura;
        
    }
    @Override
    public abstract void getPerimetro();
    @Override
    public abstract void getArea();
    
    public float setPerimetro(){
        return(pPerimetro);
    }
    public float setArea(){
        return(pArea);
    }
}
