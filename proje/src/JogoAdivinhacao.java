import javax.swing.*;

public class JogoAdivinhacao {
    private int numeroAleatorio;
    private int tentativasRestantes;

    public JogoAdivinhacao() {
        numeroAleatorio = gerarNumeroAleatorio();
        tentativasRestantes = 5;
    }

    private int gerarNumeroAleatorio() {
        return (int) (Math.random() * 100);
    }

    public void jogar() {
        boolean jogarNovamente = true;
            JOptionPane.showMessageDialog(null, "Vamos começar!");
            JOptionPane.showMessageDialog(null, "Você terá 5 tentativas para acertar o número.");
            JOptionPane.showMessageDialog(null, "O número está entre 0 e 100.");
            JOptionPane.showMessageDialog(null, "Boa sorte!");

        while (jogarNovamente) {
            JOptionPane.showMessageDialog(null, "Boa sorte!");
            while (tentativasRestantes > 0) {
                int palpite = lerPalpite();
                if (palpite == numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
                    break;
                } else if (palpite > numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "O número é menor que " + palpite);
                } else {
                    JOptionPane.showMessageDialog(null, "O número é maior que " + palpite);
                }
                tentativasRestantes--;
            }

            if (tentativasRestantes == 0) {
                JOptionPane.showMessageDialog(null, "Você perdeu!");
                JOptionPane.showMessageDialog(null, "O número era " + numeroAleatorio);
            }

            String[] opcoes = {"Jogar novamente", "Sair"};
            String escolha = (String) JOptionPane.showInputDialog(null,
                    "Deseja jogar novamente?",
                    "Jogar novamente?",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if ("Jogar novamente".equals(escolha)) {
                jogarNovamente = true;
                numeroAleatorio = gerarNumeroAleatorio();
                tentativasRestantes = 5;
            } else {
                jogarNovamente = false;
            }
        }
    }

    private int lerPalpite() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu palpite: "));
    }
}
