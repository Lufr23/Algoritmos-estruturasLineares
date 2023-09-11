package cinema;

import java.util.Scanner;

public class Opcoes {

    static String [] assentos = Mapa.getAssentos();
    private static int MAXIMO_ELEMENTOS = Mapa.getMaximo_Elementos();
    private static int cadeira;
    private static String letra;

    public static void reservaAssento() {
        String[] assentos = new String[MAXIMO_ELEMENTOS];
        System.out.println("Digite o numero da cadeira desejada:");

        Scanner numero = new Scanner(System.in);
        cadeira = numero.nextInt();
        for(int i=0; i<MAXIMO_ELEMENTOS; i++) {
            assentos[i] = ""+(i+1); //inicializa cada elemento com o indice +1
            System.out.println(assentos[i]);

        }

        //Scanner iden = new Scanner(System.in);
        //letra = iden.next();

        //String cadeiraString = Integer.toString(cadeira);
        if(cadeira <=14) {
            for (int i = 0; i < MAXIMO_ELEMENTOS; i++) {
                assentos[i]=" "+(i+1);
                System.out.println("entrou no array");
                System.out.println("Comparando com assento[" + i + "]: " + assentos[i]);


                break;
            } // Para após encontrar a correspondência


            // Para após encontrar a correspondência
            // for( int c =0; c<MAXIMO_ELEMENTOS; ++){
            //     System.out.println(assentos[i]);


    /*public static void mostraQuantidade(){
        for(int i = 0; i<MAXIMO_ELEMENTOS;i++ ){
            System.out.println("Há "+MAXIMO_ELEMENTOS+ " lugares disponíveis na seção!");
            break;

        }
    }
    public boolean posicaoEhValida(int posicao){
        return posicao >=0 && posicao < MAXIMO_ELEMENTOS;
    }*/

    /*public boolean cancelaReserva(){
        int posicao =0;
        if(!posicaoEhValida(posicao)) return false;
        assentos[posicao] = null;
        MAXIMO_ELEMENTOS--;
        return true;
  */

        }
        }
            }