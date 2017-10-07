
public class CasillaCura extends Casilla {

    public CasillaCura() {
        super.valorImpresion='+';
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
