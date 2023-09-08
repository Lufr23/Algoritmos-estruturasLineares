package cinema;

import javax.swing.*;

public class Mapa {
    int linha, coluna=0;


    private static final int MAXIMO_ELEMENTOS = 14;


    public static void imprimeMapa() {
        int MAXIMO_ELEMENTOS = 14;
        String[] identificador = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        String[] assentos = new String[MAXIMO_ELEMENTOS];
        String[] resultado = new String [identificador.length+assentos.length];


        for (int c = 0; c < MAXIMO_ELEMENTOS; c++) {
            assentos[c] = "[  ]"; // Preenche o array de colchetes com "[  ]"
        }

        for (int c = 0; c < identificador.length; c++) {
            String elemento = identificador[c];
            System.out.print(elemento + "  ");

            for (int i = 0; i < MAXIMO_ELEMENTOS; i++) {
                System.out.print(assentos[i] + " ");
            }

            System.out.println(); // Quebra de linha após cada fileira
        }




    }

    public static void tela(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                               TELA                                    |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
    }

    public static void localizaAssento(){
        System.out.println();
        System.out.println("   [ 1] [ 2] [ 3] [ 4] [ 5] [ 6] [ 7] [ 8] [ 9] [10] [11] [12] [13] [14]");
    }

    public boolean reservaAssento(String []resultado){
        for(int i=0;i<resultado.length;i++){
            if(resultado==null){
                System.out.println("Há assentos vagos");return true;
            }
        }return false;
    }
    public void linhasEcolunas(){

        if(linha<0 || linha > MAXIMO_ELEMENTOS){
            System.out.println("\nLinha Inválida, digite outra linha válida\n");
        }
        else if (coluna<0 || coluna>12){
            System.out.println("\n Coluna inválida, digite outra coluna válida!\n");

        }
        else{
            System.out.println("batata");
            {

            }
        }
    }















}