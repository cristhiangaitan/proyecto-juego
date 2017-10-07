


public class CasillaArma extends Casilla {

    public CasillaArma(char m) {
         this.setValue(m); 
        super.valorImpresion='*';
    }
    public class CasillaArma(int M){
    if (M==0){
        this.SetValue('*');
    }
}   else{
    this.setValue('.');
}

    @Override
    public void setValue(char m) {
      super.valorImpresion=m;
    }

    @Override
    public char getValue() {
        return super.valorImpresion;
    }
    
}
