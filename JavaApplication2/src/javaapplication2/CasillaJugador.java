/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labin
 */
class CasillaJugador extends Casilla{
    
    
    @Override
    public void  setValue(char cj) {
        super.valorImpresion=cj;
    }

    @Override
    public char getValue() {
        return super.valorImpresion;
    }
    
}
