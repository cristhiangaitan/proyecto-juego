
public class CasillaBorde extends Casilla {

    public CasillaBorde() {
        super.valorImpresion='X';
    }

    @Override
    public void setValue(char v) {
        super.valorImpresion=v;
    }

    @Override
    public char getValue() {
        return super.valorImpresion;
    }
}
    
