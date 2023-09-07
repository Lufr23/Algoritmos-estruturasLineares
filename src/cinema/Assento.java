package cinema;

public class Assento {


        static int[] numeroAssento= {1,2,3,4,5,6,7};
        String []letraAssento = {"A","B", "C","D","E","F","G","H","I","J","K","L"};




    public int[] getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int[] numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String[] getLetraAssento() {
        return letraAssento;
    }

    public void setLetraAssento(String[] letraAssento) {
        this.letraAssento = letraAssento;
    }

    public static boolean imprimeAssento(){
        if(numeroAssento!=null){
            for(int i=0;i<numeroAssento.length;i++){
                System.out.print(numeroAssento[i]);
            }return true;

        }return false;
    }

    public boolean imprimeAssento2(){
        if(letraAssento!=null){
            for(int i=0;i<letraAssento.length;i++){
                System.out.println(letraAssento[i]);
            }return true;

        }return false;
    }


















}
