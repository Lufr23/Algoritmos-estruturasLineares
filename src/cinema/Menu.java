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
                System.out.println("voce esta reservando o seu lugar no cinema");
                break;
            case 2:
                System.out.println("Voce esta cancelando a sua presença nessa sessão");
                break;
            case 3:
                System.out.println("Voce esta escolhendo o seu assento na sessão");
                break;
            case 4:
                System.out.println("tem tantas pessoas na sessão");
                break;
        }

    }

    public static void main(String[] args) {
        menu();
        escolheMenu();
    }

    public Menu(int tamanho){
        assentos = new Assento[tamanho];
        numeroCadeiras =0;
    }

    public boolean adicionaAssento(Assento assento){
        if(numeroCadeiras == assentos.length)
            return false;
        assentos[numeroCadeiras++] = assento;
        return true;
    }









}
