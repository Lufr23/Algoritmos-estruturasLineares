package cinema;
import java.lang.System;
import java.util.Scanner;
import cinema.Assento;



public class Menu {
    private static final int MAXIMO_LUGARES = 10;
    int numeroCadeiras;
    Assento []assentos;

    public static void menu(){
        System.out.println("=============== MENU =================");
        System.out.println("\n1. Realizar reserva ");
        System.out.println("2. Cancelar reserva ");
        System.out.println("3. Escolher assentos ");
        System.out.println("4. Mostrar quantidade pessoas na sessão ");

    }

    public static void escolheMenu(){

        System.out.println("\n Digite a opção desejada no menu: ");
        Scanner numero = new Scanner(System.in);
        int escolha = numero.nextInt();


        switch (escolha){

            case 1:
                Opcoes.reservaAssento();
                break;
            case 2:
                //Opcoes.
                break;
            case 3:
                Mapa.tela();
                Mapa.imprimeMapa();
                Mapa.localizaAssento();
                break;
            case 4:
               // Opcoes.mostraQuantidade();
                break;
        }

    }














}
