import javax.swing.*;
public class Exercicio11extra {
    public static void main(String[] args) {

        double opcao;
        double ingresso;
        double preco;
        double quantidade;
        double formaPagamento;

        preco = 0;
        quantidade = 0;
        ingresso = 0;
        formaPagamento = 1;

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



                 for (int cont2 = 0; cont2<1;cont2++){

                     formaPagamento = Double.parseDouble(JOptionPane.showInputDialog("Informe a forma de pagamento" +
                             "\n\nDigite:\n(1) Boleto\n(2) Cartão\n(3) Pix"));

                     if (formaPagamento==1){
                         //Boleto
                         JOptionPane.showMessageDialog(null, "O valor total da sua compra foi de R$"+ (quantidade * preco) +
                                 "\n\nObrigado pela compra!");
                     } else if (formaPagamento==2) {
                         //Cartao
                         JOptionPane.showMessageDialog(null, "O valor total da sua compra foi de R$"+ ((quantidade * preco)+(preco*0.05)) +
                                 "\n\nObrigado pela compra!");
                     } else if (formaPagamento==3) {
                         //Pix
                         JOptionPane.showMessageDialog(null, "O valor total da sua compra foi de R$"+ ((quantidade * preco)-(preco*0.05)) +
                                 "\n\nObrigado pela compra!");
                     }else {
                         JOptionPane.showMessageDialog(null, "Valor invalido!");
                         cont2--;
                     }
                 }

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
