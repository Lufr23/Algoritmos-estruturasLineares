package cinema_test;

import cinema.*;
import cinema.Assento;

public class Cinema_test {
    public static void main(String[] args) {
        Assento as1 = new Assento();
       // System.out.println("-----------TELA--------------");
        //as1.imprimeAssento();
        //as1.imprimeAssento2();
        Menu.menu();
        //Mapa.localizaAssento();
        //Opcoes.mostraQuantidade();
        Menu.escolheMenu();
        Opcoes op1 = new Opcoes();
        //op1.cancelaReserva();

        //declara assim para imprimir de uma classe para outra -> NOMECLASSE.nomeFunção();
        //Assento.imprimeAssento();

    }
}
