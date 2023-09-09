package cinema;

public class Opcoes {

    static String [] assentos = Mapa.getAssentos();
    private static int MAXIMO_ELEMENTOS = 14;


    public static void reservaAssento(){
        for(int i = 0; i<MAXIMO_ELEMENTOS;i++ ){
            System.out.println("Reserva feita!");
            break;
        }
    }
    public static void mostraQuantidade(){
        for(int i = 0; i<MAXIMO_ELEMENTOS;i++ ){
            System.out.println("Há "+MAXIMO_ELEMENTOS+ " lugares disponíveis na seção!");
            break;

        }
    }
    public boolean posicaoEhValida(int posicao){
        return posicao >=0 && posicao < MAXIMO_ELEMENTOS;
    }

    public boolean cancelaReserva(){
        int posicao =0;
        if(!posicaoEhValida(posicao)) return false;
        assentos[posicao] = null;
        MAXIMO_ELEMENTOS--;
        return true;
    }








}
