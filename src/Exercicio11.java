import javax.swing.*;

public class Exercicio11 {
    public static void main(String[] args) {

        double opcao;
        double ingresso;
        double preco;
        double quantidade;

        preco = 0;
        quantidade = 0;
        ingresso = 0;

        for (int cont = 1; cont>0; cont++){
            if (ingresso==3){
                break;
            }
            opcao = Double.parseDouble(JOptionPane.showInputDialog
                    ("Deseja comprar ingressos:\n\nDigite: \n(1)Para comprar \n(2) para sair"));

            if (opcao==1){
                //COMPRAR INGRESSO
                while (preco==0){

                    ingresso = Double.parseDouble(JOptionPane.showInputDialog("Escolha o tipo do ingresso:\n\nDigite:\n" +
                            "(1) Inteira\n(2) Meia\n(3) Sair"));
                    if (ingresso==1){
                        //INTEIRA
                        preco = 150.00;

                    } else if (ingresso == 2) {
                        //MEIA
                        preco = 75.00;

                    } else if (ingresso == 3) {
                        break;
                    } else if (ingresso<1 || ingresso>3) {
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                    }
                }

                if (ingresso != 3){
                    quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de ingressos:"));

                    JOptionPane.showMessageDialog(null, "O valor total da sua compra foi de R$"+ (quantidade * preco) +
                            "\n\nObrigado pela compra!");
                }

            }else if (opcao==2){
                //SAIR
                break;
            } else {
                //INVALIDO
                JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
            cont--;
            System.out.println(ingresso);
        }

    }
}
