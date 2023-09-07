package cinema;

public class Mapa {

 public static void imprimeMapa() {
       int MAXIMO_ELEMENTOS = 14;
       String[] identificador = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
       String[] assentos = new String[MAXIMO_ELEMENTOS];

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

}
