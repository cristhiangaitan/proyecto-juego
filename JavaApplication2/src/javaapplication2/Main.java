
import java.util.Scanner;

public class Main {

    private static Scanner SC;
    
    public static void main(String[] args) {
       SC= new Scanner(System.in);
        System.out.println("Ingrese A: ");
        int A=SC.nextInt();
        System.out.println("Ingrese B: ");
        int B=SC.nextInt();
        Mapa m=new Mapa(A, B);
        int jug=9;
        do
        {
            System.out.println("Ingrese El numero de Jugadores: ");
            jug=SC.nextInt();
        }while(jug>9||jug<=1);
        m.setJugadores(jug);
        for(int i=1;i<=jug;i++)
        {
            m.addJugador(i);
        }
        System.out.println("Ingrese la Cantidad de Armas: ");
        int armas= SC.nextInt();
        System.out.println("Escoja el tipo de arma: ");
        System.out.println("1. Arma a distancia: ");
        System.out.println("2. Arma cuerpo a cuerpo: ");
        int tipoarma= SC.nextInt();
        m.setArmas(armas);
        for(int i=1;i<=armas;i++)
        {
            m.addArma();
        }
        System.out.println("Ingrese el numero de Curas: ");
        int curas= SC.nextInt();
        m.setCuras(curas);
        for(int i=1;i<=curas;i++)
        {
            m.addCura();
            
        }
         System.out.println("Ingrese el numero de Refugios: ");
        int refugios= SC.nextInt();
        m.setrefugios(refugios);
        for(int i=1;i<=refugios;i++)
        {
            m.addRefugio();
        }
        imprimirMapa(m.getMapa());
       
    }
    
    private static void imprimirMapa(Casilla [][] mapa) {
        for(int i=0;i<mapa.length;i++)
        {
            for(int j=0;j<mapa[i].length;j++)
            {
                System.out.print(mapa[i][j].getValue());
            }
            System.out.println("");
        }
    }
    
}
