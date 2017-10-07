public class CasillaRefugio extends Casilla {

    
     public CasillaRefugio() {
        super.valorImpresion='/';
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
