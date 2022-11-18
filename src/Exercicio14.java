public class Exercicio14 {
    public static void main(String[] args) {

        int [] numero = new int[51];
        int anterior;
        anterior = 0;

        for (int cont = 0 ; cont<50; cont++){
            if (cont>1){
                anterior = cont -1;
            }
            numero[cont] = numero[anterior]+ 1;
        }
        for (int cont2 = 0 ; cont2<50 ; cont2++){
            System.out.println(numero[cont2]);
        }
    }
}
