import javax.swing.*;

public class Exercicio13 {
    public static void main(String[] args) {

        int [] nota = new int[5];
        int soma;
        int media;
        int acima;

        soma = 0;
        media = 0;
        acima = 0;

        for (int cont=0 ; cont<30;cont++){
            nota [cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do " + (cont+1) +"º aluno :"));
            if (nota[cont]<0 || nota[cont]>10){
                //valor invalido
            }else if (nota[cont]>=0 && nota[cont]<=10){
                //valor valido
                soma = soma + nota[cont];
            }
        }
        media = soma/30;
        for (int cont2=0;cont2<30; cont2++){
            if (nota[cont2]>=media){
                acima++;
            }
        }
        JOptionPane.showMessageDialog(null, "A média das notas é " + media + " e tivemos " +
                acima + " alunos com notas acima ou igual a média.");
    }
}
