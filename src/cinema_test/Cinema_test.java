package cinema_test;

import cinema.Assento;
import cinema.Mapa;
import cinema.Assento;

public class Cinema_test {
    public static void main(String[] args) {
        Assento as1 = new Assento();
       // System.out.println("-----------TELA--------------");
        //as1.imprimeAssento();
        //as1.imprimeAssento2();
        Mapa.tela();
        Mapa.imprimeMapa();
        Mapa.localizaAssento();

        //declara assim para imprimir de uma classe para outra -> NOMECLASSE.nomeFunção();
        //Assento.imprimeAssento();

    }
}
