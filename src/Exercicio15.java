import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {

        int tam;
        int opcao;
        int pesquisa;

        tam = 1;
        opcao = 0;
        pesquisa = 0;

        JOptionPane.showMessageDialog(null, "Sistema de cadastro de livros!");

        for (int cont=0 ; cont<=tam ; cont++){

            String [] titulo = new String[tam];
            String [] autor = new  String[tam];
            String [] edicao = new String[tam];
            String [] editora = new String[tam];
            String [] lancamento = new String[tam];
            String [] genero = new String[tam];

            titulo[cont] = JOptionPane.showInputDialog("Digite o titulo: ");
            autor[cont] = JOptionPane.showInputDialog("Digite o autor: ");
            edicao[cont] = JOptionPane.showInputDialog("Digite a edicao: ");
            editora[cont] = JOptionPane.showInputDialog("Digite a editora: ");
            lancamento[cont] = JOptionPane.showInputDialog("Data de lançamento: ");
            genero[cont] = JOptionPane.showInputDialog("Digite o gênero: ");

            System.out.println(titulo[cont]);

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n\n(1) Novo cadastro\n(2) Finalizar"));
                if (opcao==2){
                    pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de algum livro para receber informações sobre o mesmo: "));
                    int pesquisaReal = pesquisa - 1 ;

                    JOptionPane.showMessageDialog(null, "Dados do livro:\n" +
                            "\nTitulo:" + titulo[pesquisaReal] +
                            "\nAutor" + autor[pesquisaReal] +
                            "\nEdiçao:" + edicao[pesquisaReal] +
                            "\nEditora:" + editora[pesquisaReal] +
                            "\nLançamento:" + lancamento[pesquisaReal] +
                            "\nGênero:" + genero[pesquisaReal]);
                    break;
                }else if (opcao==1){
                    tam++;
                }
            }
        }
    }
